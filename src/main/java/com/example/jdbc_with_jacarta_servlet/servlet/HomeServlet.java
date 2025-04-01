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

@WebServlet(name = "HomeServlet", value = "")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = new ArrayList<>();
        try{
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/jacarta?currentSchema=jdbc_expression",
                    "postgres",
                    "123"
            );

            PreparedStatement ps = connection.prepareStatement("select * from book order by id");
            PreparedStatement ps = connection.prepareStatement("select * from book");
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Book book = Book.builder()
                        .id(resultSet.getInt("id"))
                        .title(resultSet.getString("title"))
                        .peges(resultSet.getInt("peges"))
                        .build();
                books.add(book);
            }

        }

        catch (SQLException e){
            throw new ServletException(e);
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/home.jsp");
        req.setAttribute("books", books);
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

