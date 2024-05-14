package com.login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginControllerFood3", urlPatterns = "/food")
public class LoginControllerFood3 extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // 로그인 입력폼으로 전달.
    System.out.println("get 으로 login 처리");
    RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/login/food.jsp");
    requestDispatcher.forward(req,resp);
  }
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // 로그인 처리 후, 메인으로 이동.
    // 디비 연결도 없고, dao,dto 등 서비스 가 없어서, 단순
    // 메인으로 이동만했음. lsy, 1234 , 메인으로 , 아니면 로그인 폼으로 이동.
    System.out.println("login-result 받기, post 로 받기");
    String food = req.getParameter("food");


    if (food.equals("밥")) {
      // 메인, index 로가기.
      System.out.println("성공. "+food);
      resp.sendRedirect("/");
    } else {
      // 실패면, 로그인 폼으로 가기.
      System.out.println("실패 "+food);
      resp.sendRedirect("/food");
    }


  }

}







