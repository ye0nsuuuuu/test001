package com.lunchMenu.controller;

import com.lunchMenu.dto.LunchMenuDTO;
import com.lunchMenu.service.LunchMenuService;
import com.todo.dto.TodoDTO;
import com.todo.service.TodoService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@Log4j2
@WebServlet(name = "LunchMenuList",urlPatterns = "/lunchmenu/list")
public class LunchMenuListController extends HttpServlet {

    private LunchMenuService lunchMenuService = LunchMenuService.INSTANCE;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // DB 에서 , 전체 목록을 가져오기.

        try {

            List<LunchMenuDTO> sampleList = lunchMenuService.listAll();
            log.info("LunchmenuListController , 확인2, sampleList : " + sampleList);

            // 컨트롤러에서 (서버)-> 화면(jsp)에 -> 데이터 전달
            req.setAttribute("list",sampleList);
            req.getRequestDispatcher("/WEB-INF/LunchMenu/LunchMenuList.jsp")
                    .forward(req, resp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}