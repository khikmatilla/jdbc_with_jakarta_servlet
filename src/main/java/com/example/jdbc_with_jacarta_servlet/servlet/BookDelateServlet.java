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


@WebServlet(name = "BookDelateServlet", value = "/book/delete/*")
public class BookDelateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        int id = Integer.parseInt(pathInfo.substring(1));

        try{
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/jacarta?currentSchema=jdbc_expression",
                    "postgres",
                    "123"
            );

            PreparedStatement ps = connection.prepareStatement("select * from book where book.id = ?");
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                Book book = Book.builder()
                        .id(resultSet.getInt("id"))
                        .title(resultSet.getString("title"))
                        .peges(resultSet.getInt("peges"))
                        .build();
                req.setAttribute("book", book);
                System.out.println(book);
                RequestDispatcher dispatcher = req.getRequestDispatcher("/views/book/delete.jsp");
                dispatcher.forward(req, resp);
            }

        }

        catch (SQLException e){
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        int id = Integer.parseInt(pathInfo.substring(1));
        try{
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/jacarta?currentSchema=jdbc_expression",
                    "postgres",
                    "123"
            );

            PreparedStatement ps = connection.prepareStatement("delete from book b where b.id = ?;");
            ps.setInt(1, id);
            ps.execute();
            resp.sendRedirect("/");
        }

        catch (SQLException e){
            throw new ServletException(e);
        }resp.getWriter().println("Delete Book");
    }
}


