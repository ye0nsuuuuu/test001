package com.lunchMenu.controller;

import com.lunchMenu.dto.LunchMenuDTO;
import com.lunchMenu.service.LunchMenuService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "LunchMenuReg",urlPatterns = "/lunchmenu/register")
public class LunchMenuRegController extends HttpServlet {

    private LunchMenuService lunchMenuService = LunchMenuService.INSTANCE;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/LunchMenu/LunchMenuReg.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // todo 글 입력 처리 하는 로직.
        // TodoDTO 타입을 받아서, 서비스에 전달하는 로직.
        LunchMenuDTO lunchmenuDTO = LunchMenuDTO.builder()
                // 화면에서, name : title
                .menuTitle(req.getParameter("MenuTitle"))
                // 화면에서, name : dueDate
                .menuRegDate(LocalDate.parse(req.getParameter("MenuRegDate")))
                .build();

        // 실제 데이터 입력하기.
        try {
            // todoDTO, 입력받은 내용을 담아서, 서비스에 보내기
            lunchMenuService.register2(lunchmenuDTO);
            // 리다이렉트, 메인: 리스트
            resp.sendRedirect("/lunchmenu/list");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
