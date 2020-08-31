package com.example.appengine.java8;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String first = request.getParameter("first");
        String last = request.getParameter("last");

        request.setAttribute("name", first+" "+last);
        request.getRequestDispatcher("/hello.jsp").forward(request, response);
    }
}