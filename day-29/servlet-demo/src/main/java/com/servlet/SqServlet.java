package com.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SqServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//        int i = (int) req.getAttribute("sum");
//        int i = Integer.parseInt(req.getParameter("sum"));

//        HttpSession session = req.getSession();
        Cookie[] cookies = req.getCookies();

        List<Cookie> cookieList = Arrays.stream(cookies).filter(cookie -> cookie.getName().equals("sum")).toList();
//        int i = (int) session.getAttribute("sum");

        int i = Integer.parseInt(cookieList.get(0).getValue());
        resp.getWriter().println(i * i);
    }
}
