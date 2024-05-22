package com.lunchMenu.controller;

import com.lunchMenu.dto.LunchMenuDTO;
import com.lunchMenu.service.LunchMenuService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@Log4j2
@WebServlet(name = "LunchMenuUpdate", urlPatterns = "/lunchmenu/update")
public class LunchMenuUpdateController extends HttpServlet {
    private LunchMenuService lunchMenuService = LunchMenuService.INSTANCE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            Long menuNo = Long.valueOf(req.getParameter("menuNo"));
            LunchMenuDTO sample = lunchMenuService.getSelectOne(menuNo);

            log.info("lunchMenuController : " + sample);

            req.setAttribute("sample", sample);
            req.getRequestDispatcher("/WEB-INF/LunchMenu/LunchMenuUpd.jsp")
                    .forward(req, resp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long menuNo = Long.valueOf(req.getParameter("menuNo"));
        log.info("menuNo 1: " + menuNo);
        String menuTitle = req.getParameter("menuTitle");
        log.info("MenuTitle 2: " + menuTitle);
        LocalDate menuRegDate =LocalDate.parse(req.getParameter("menuRegDate"));
        log.info("MenuRegDate 3: " + menuRegDate);

        LunchMenuDTO lunchMenuDTO = LunchMenuDTO.builder()
                .menuNo(menuNo)
                .menuTitle(menuTitle)
                .menuRegDate(menuRegDate)
                .build();

        try{
            lunchMenuService.updateLunchMenu(lunchMenuDTO);
            resp.sendRedirect("/lunchmenu/list");
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
