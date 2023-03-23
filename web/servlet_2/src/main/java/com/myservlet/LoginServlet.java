package com.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // String userName = req.getParameter("userName");
        // String password = req.getParameter("password");
        // resp.setContentType("text/html");
        // if(userName.equals("hassan") && password.equals("password")){
        // req.getRequestDispatcher("/home").forward(req, resp);
        // }
        // else{
        // PrintWriter out = resp.getWriter();
        // out.println("login field try again");
        // req.getRequestDispatcher("index.html").include(req, resp);
        // }

        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        resp.setContentType("text/html");
        if(userName.equals("hassan") && password.equals("password")){
        resp.sendRedirect("/home?userName="+userName);
        }
        else{
        PrintWriter out = resp.getWriter();
        out.println("login field try again");
        resp.sendRedirect("/login");
        }



    }

}
