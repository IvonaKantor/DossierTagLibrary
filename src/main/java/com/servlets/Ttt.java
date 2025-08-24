package com.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Ttt", urlPatterns = "/Ttt")
public class Ttt extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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

            String sex = request.getParameter("sex");
            if ("male".equals(sex)) {
                out.println("<p>Sex: Male</p>");
            } else if ("female".equals(sex)) {
                out.println("<p>Sex: Female</p>");
            } else {
                out.println("<p>Sex: Not specified</p>");
            }

            out.println("<br>");
            out.println("<a href='Ttt.jsp'>Back to Form</a>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("Ttt.jsp");
    }
}