package com.myservlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    ServletConfig myConfig;

    @Override
    public void init(ServletConfig config) throws ServletException {
        myConfig = config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if(session != null)
        resp.getWriter().println(req.getSession().getAttribute("loggedIn"));
        else resp.sendRedirect("login.html");
//        if (session.getAttribute("loggedIn").equals("true")) {
//            resp.getWriter().println("hi there");
//        } else {
//            resp.getWriter().println("please Login");
//        }
    }
}