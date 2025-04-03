package com.example.jdbc_with_jacarta_servlet.session;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionServlet implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        String id = session.getId();
        System.out.println("Session created ID: " + id);
        //session.setMaxInactiveInterval(3);

    }
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        String id = session.getId();
        System.out.println("Session destroyed ID: " + id);
    }
}
