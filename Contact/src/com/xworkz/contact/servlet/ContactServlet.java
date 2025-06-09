package com.xworkz.contact.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/Contact", loadOnStartup = 1)
public class ContactServlet extends GenericServlet {

    public ContactServlet() {
        System.out.println("ContactServlet created by Tomcat...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws ServletException, IOException {
        System.out.println("Running service in ContactServlet...");

        String name = servletRequest.getParameter("name");
        String email = servletRequest.getParameter("email");
        String mobile = servletRequest.getParameter("mobile");
        String comments = servletRequest.getParameter("comments");

        // Set attributes to forward to JSP
        servletRequest.setAttribute("name", name);
        servletRequest.setAttribute("email", email);
        servletRequest.setAttribute("mobile", mobile);
        servletRequest.setAttribute("comments", comments);

        // Forward to ContactResult.jsp
        RequestDispatcher dispatcher = servletRequest.getRequestDispatcher("ContactResult.jsp");
        dispatcher.forward(servletRequest, servletResponse);
    }
}
