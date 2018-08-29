package com.ex.web;

import com.ex.model.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BookServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // harcoding since before it was cool
        Book b = new Book();
        b.setTitle("Web Programming for Dummies");
        b.setAuthor("August Duet");
        b.setPubYear("2020");

        String bJson = new ObjectMapper().writeValueAsString(b);
        resp.getWriter().write(bJson);
        resp.setStatus(200);
        resp.setHeader("Content-Type", "application/json");
    }
}
