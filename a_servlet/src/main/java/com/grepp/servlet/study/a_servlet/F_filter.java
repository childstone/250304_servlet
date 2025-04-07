package com.grepp.servlet.study.a_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/filter/*")
public class F_filter extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        
        String url = req.getRequestURI();
        String[] urlArr = url.split("/");
        
        switch (urlArr[urlArr.length - 1]) {
            case "error":
                break;
            case "path":
                path(req, resp);
                break;
            default:
                resp.setStatus(404);
        }
    }
    
    private void path(HttpServletRequest req, HttpServletResponse resp) {
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
