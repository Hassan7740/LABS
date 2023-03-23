package com.myservlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    ServletConfig myConfig;

    @Override
    public void init(ServletConfig config) throws ServletException {
        myConfig = config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        Cookie[] cookies = req.getCookies();

        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                out.println("<h3> cookieName :" + cookies[i].getName() + "</h3>" + "<br>" + "<h3> cookieValue : " + cookies[i].getValue() + "</h3>" + "<br>");
            }
        } else {
            out.println("enable your cookies dear cheers");
        }
    }
}
