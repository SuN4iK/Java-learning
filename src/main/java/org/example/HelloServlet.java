package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;


@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession httpSession = request.getSession();
        String name= (String) httpSession.getAttribute("name");

        //Cookie[] cookies = request.getCookies();
        //String cookieName = "user";
        //Cookie cookie = null;
        //if(cookies!= null){
        //    for (Cookie cookie1:cookies){
        //        if (cookieName.equals(cookie1.getName())){
        //            cookie=cookie1;
        //            break;
        //        }
        //    }
        //}

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();


        String id = request.getParameter("id");
        String username = request.getParameter("name");
        String age = request.getParameter("age");

        try {
            if (name==null){
                httpSession.setAttribute("name","Sergey");
                writer.println("Session set");
            }
            else {
                writer.println("Name: " + name);
                httpSession.removeAttribute("name");
            }
            //writer.println("Name: " + cookie.getValue());
            writer.println("<h1>Hello from HelloServlet with id" + id + " " + username + " " + age + "</h1>");
        } finally {
            writer.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String name = req.getParameter("username");
        String age = req.getParameter("userage");
        String gender = req.getParameter("gender");
        String country = req.getParameter("country");
        String[] pLanguages = req.getParameterValues("pl");

        try {
            writer.println("<p>Name: " + name + "</p>");
            writer.println("<p>Age: " + age + "</p>");
            writer.println("<p>Gender: " + gender + "</p>");
            writer.println("<p>Country: " + country + "</p>");
            writer.println("<p>PLanguages: ");
            for (String pl : pLanguages) {
                writer.println(pl);
            }

        } finally {
            writer.close();
        }
    }
}