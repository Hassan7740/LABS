package com.myservlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    ServletConfig myConfig;

    @Override
    public void init(ServletConfig config) throws ServletException {
        myConfig = config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        resp.setContentType("text/html");
        if (userName.equals("hassan") && password.equals("password")) {
            HttpSession session = req.getSession(true);
            session.setAttribute("loggedIn" , new String("true"));
            req.getRequestDispatcher("home").forward(req, resp);
        } else {
            PrintWriter out = resp.getWriter();
            out.println("login field try again");
            req.getRequestDispatcher("login.html").include(req, resp);
        }


    }

}
