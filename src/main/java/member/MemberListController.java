package member;

import member.dto.MemberDTO;
import member.service.MemberService;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.util.List;
@WebServlet(name = "MemberController",urlPatterns="/member/list")
public class MemberListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<MemberDTO> sampleList= MemberService.INSTANCE.getList();
        req.setAttribute("list", sampleList);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("/WEB-INF/member/memberList.jsp");
        requestDispatcher.forward(req, resp);
    }
}
