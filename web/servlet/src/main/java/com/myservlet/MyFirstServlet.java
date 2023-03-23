package com.myservlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.print.event.PrintEvent;

import jakarta.servlet.*;


public class MyFirstServlet implements Servlet {

    @Override
    public void destroy() {

        System.out.println("this is destroyed");
    }

    @Override
    public ServletConfig getServletConfig() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getServletInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void init(ServletConfig arg0) throws ServletException {
        System.out.println("init method");
        
    }

    @Override
    public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
        PrintWriter out = arg1.getWriter();
        out.println("<h1>this is Login<h1>"); 
        
    }
    
}
