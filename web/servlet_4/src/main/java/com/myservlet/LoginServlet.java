package com.myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    ServletConfig myConfig;
    @Override
    public void init(ServletConfig config) throws ServletException {
        myConfig = config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//         String userName = req.getParameter("userName");
//         String password = req.getParameter("password");
//         resp.setContentType("text/html");
//         if(userName.equals("hassan") && password.equals("password")){
//         req.getRequestDispatcher("/home").forward(req, resp);
//         }
//         else{
//         PrintWriter out = resp.getWriter();
//         out.println("login field try again");
//         req.getRequestDispatcher("index.html").include(req, resp);
//         }
//
//         String userName = req.getParameter("userName");
//         String password = req.getParameter("password");
//         resp.setContentType("text/html");
//         if(userName.equals("hassan") && password.equals("password")){
//         resp.sendRedirect("/home?userName="+userName);
//         }
//         else{
//         PrintWriter out = resp.getWriter();
//         out.println("login field try again");
//         resp.sendRedirect("/login");
//         }
//         Oreo instance = (Oreo)myConfig.getServletContext().getAttribute("oreo");
//         resp.getWriter().println(instance.getName());

        Enumeration<String> headers = req.getHeaderNames();

        while(headers.hasMoreElements()){
          String headerElement =  headers.nextElement();
          resp.getWriter().println(headerElement + " : "  + req.getHeader(headerElement) + "<br>");
        }

    }

}
