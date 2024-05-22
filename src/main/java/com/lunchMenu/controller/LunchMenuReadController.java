package com.lunchMenu.controller;

import com.lunchMenu.dto.LunchMenuDTO;
import com.lunchMenu.service.LunchMenuService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Log4j2
@WebServlet(name = "lunchmenuRead", urlPatterns = "/lunchmenu/read")
public class LunchMenuReadController extends HttpServlet {

    private LunchMenuService lunchMenuService = LunchMenuService.INSTANCE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Long menuNo = Long.valueOf(req.getParameter("menuNo"));
            LunchMenuDTO sample = lunchMenuService.getSelectOne(menuNo);
            log.info("LunchMenuController,check2, sample" + sample);

            req.setAttribute("sample", sample);
            req.getRequestDispatcher("/WEB-INF/LunchMenu/LunchMenuRead.jsp")
                    .forward(req, resp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
