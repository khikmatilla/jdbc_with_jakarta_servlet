package com.example.jdbc_with_jacarta_servlet.context_event;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import lombok.extern.java.Log;

@Log
public class StartUpShutDownListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        log.info(":::::::::::::::::::: APPLICATION STARTED ::::::::::::::::::::::::");
    }


    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
        log.info(":::::::::::::::::::: APPLICATION SHUTTING DOWN ::::::::::::::::::::::::::");
    }
}
