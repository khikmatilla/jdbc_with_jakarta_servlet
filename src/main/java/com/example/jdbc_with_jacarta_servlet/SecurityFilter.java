package com.example.jdbc_with_jacarta_servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class SecurityFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        var req = (HttpServletRequest) (servletRequest);
        var res = (HttpServletResponse) (servletResponse);
        HttpSession session = req.getSession();
        String username = (String) session.getAttribute("username");
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);
//        if (!requestURI.equals("/login") && username == null) {
//            res.sendRedirect("/login");
//        } else {
//            filterChain.doFilter(req, res);
//        }
    }
}
