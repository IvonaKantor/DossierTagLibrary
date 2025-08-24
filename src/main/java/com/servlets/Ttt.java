package com.servlets;

import javax.servlet.*;
import javax.servlet.http;
import javax.servlet.annotation;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Ttt", urlPatterns = "/Ttt")
public class Ttt extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>Results</title></head>");
            out.println("<body>");
            out.println("<h1>Data entered: </h1>");
            out.println("<p>Lastname: " + request.getParameter("lastname") + "</p>");
            out.println("<p>Surname: " + request.getParameter("surname") + "</p>");
            out.println("<p>Sex: " +
                    ("male".equals(request.getParameter("sex")) ? "Male" : "Female") + "</p>");
            out.println("</div>");
            out.println("<br>");
            out.println("<a href='Ttt.jsp'>Back to Form</a>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}

@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.sendRedirect("Ttt.jsp");
}
