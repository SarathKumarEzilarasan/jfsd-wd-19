package com.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

//        resp.getWriter().println(i+j);
//        req.setAttribute("sum", i + j);
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("sq");
//        requestDispatcher.forward(req, resp);

//        resp.sendRedirect("sq?sum=" + (i + j));

//        HttpSession session = req.getSession();
//        session.setAttribute("sum", i + j);

        int k = i + j;

        Cookie cookie = new Cookie("sum", k + "");
        resp.addCookie(cookie);
        resp.sendRedirect("sq");
    }
}
