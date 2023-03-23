package com.myservlet;

import jakarta.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.jsp.jstl.core.Config;

public class HomeServlet extends HttpServlet {
    ServletConfig myConfig;
    @Override
    public void init(ServletConfig config) throws ServletException {
        myConfig = config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String initParam = myConfig.getInitParameter("AdminEmail");
         resp.getWriter().println("<h1>the init params value is : " + initParam);
        
//        ServletContext servletContext ;
//        Oreo biscOreo = new Oreo("hamza");
//        String contextParam = myConfig.getServletContext().getInitParameter("contextParam");
//        myConfig.getServletContext().setAttribute("oreo", biscOreo);
//        resp.getWriter().println("<h1> this is the context param :" + contextParam);
    }
}
