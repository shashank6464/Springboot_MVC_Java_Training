package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns ="/players.do")
public class PlayerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String playerName =request.getParameter("name");
        System.out.println(playerName);
        request.setAttribute("jspPlayerName", playerName);

        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);

//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<head>" +
//                "<title>Player</title/>"+
//                "</head>");
//        writer.println("<body>"+
//                "<h1>Welcome to Player Application1</h1>"+
//                "<h2>Welcome to Player Application1</h2>"+
//                "<h3>Welcome to Player Application1</h3>"+
//                "<h4>Welcome to Player Application1</h4>"+
//                "<h5>Welcome to Player Application1</h5>"+
//                "</body>");
//        writer.println("</html>");
    }


}
