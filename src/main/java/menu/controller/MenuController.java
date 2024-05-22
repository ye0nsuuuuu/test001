package menu.controller;

import menu.dto.MenuDTO2;
import menu.service.MenuService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MenuController", urlPatterns = "/menu/list")
public class MenuController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    // 임시 더미 메뉴 10개 등록 .
    // 서비스에서 기능 만든것을 재사용.
    // 서버 -> 클라이언트(뷰)
    List<MenuDTO2> sampleList = null;
    try {
      sampleList = MenuService.INSTANCE.listAll();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    req.setAttribute("list",sampleList);
        
    // 기본, 뷰 jsp 파일로 전달하기.
    RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/menu/menuList.jsp");
    requestDispatcher.forward(req, resp);

  }
}







