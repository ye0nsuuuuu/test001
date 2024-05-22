package com.lunchMenu.controller;

import com.lunchMenu.service.LunchMenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "lunchmenuDelete",urlPatterns = "/lunchmenu/delete")
public class LunchMenuDeleteController extends HttpServlet {
    private LunchMenuService lunchMenuService = LunchMenuService.INSTANCE;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Long menuNo =Long.valueOf(req.getParameter("menuNo"));
        try{
            lunchMenuService.deleteLunchMenu(menuNo);
        } catch (Exception e){
            throw new RuntimeException(e);
        }



        resp.sendRedirect("/lunchmenu/list");
    }
}

