package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Ttt", urlPatterns = "/Ttt")
public class Ttt extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        if("Cancel".equals(request.getParametr("submit"))){
            response.sendRedirect("index.html");
            return;
        }

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>Results</title></head>");
            out.println("<body>");
            out.println("<h1>Data entered: </h1>");
            out.println("<p>Lastname: " + request.getParameter("lastname") + "</p>");
            out.println("<p>Surname: " + request.getParameter("surname") + "</p>");
            out.println("<p>Sex: " +
                    ("male".equals(request.getParameter("sex")) ? "Male" : "Female") + "</p>");
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }
}
