package com.example.jdbc_with_jacarta_servlet.servlets;

import com.example.jdbc_with_jacarta_servlet.entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "SimpleServlet", value = "/SimpleServlet")
public class SimpleServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        EntityManagerFactory entityMenagerFactory= Persistence.createEntityManagerFactory("orm_example");
        EntityManager entityManager=entityMenagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Book book = Book.builder()
                .id(1)
                .title("Spring 10")
                .pages(100)
                .build();
        entityManager.persist(book);


        entityManager.getTransaction().commit();
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

    }
}
