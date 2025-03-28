package com.example.jdbc_with_jacarta_servlet.servlet;

import com.example.jdbc_with_jacarta_servlet.model.Book;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.postgresql.Driver;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "BookAddServlet", value = "/book/add")
public class BookAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/book/create.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        int peges = Integer.parseInt(req.getParameter("peges"));
//        Book book = Book.builder()
//                .title(title)
//                .peges(peges)
//                .build();


        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/jacarta?currentSchema=jdbc_expression",
                    "postgres",
                    "123"
            );
            PreparedStatement ps = connection.prepareStatement("INSERT INTO book (title, peges) VALUES (?, ?)");
            ps.setString(1, title);
            ps.setInt(2, peges);
            ps.execute();
            resp.sendRedirect("/");

        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}


