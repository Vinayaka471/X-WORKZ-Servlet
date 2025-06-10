package com.xworkz.climate;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/Weather",loadOnStartup = 1)
public class WeatherServlet extends GenericServlet {

    public WeatherServlet(){
        System.out.println("Weather Servlet Created");

    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String name = servletRequest.getParameter("locationname");
        String capturedBy = servletRequest.getParameter("Capturedname");
        String Temp = servletRequest.getParameter("tempname");
        String Record_Date = servletRequest.getParameter("datename");

        servletRequest.setAttribute("locationname",name);
        servletRequest.setAttribute("capturedname",capturedBy);
        servletRequest.setAttribute("tempname",Temp);
        servletRequest.setAttribute("datename",Record_Date);

        LocalDate date = LocalDate.parse(Record_Date);

        WeatherDTO weatherDTO = new WeatherDTO();

        weatherDTO.setLocationname(name);

        weatherDTO.setCapturedname(capturedBy);

        weatherDTO.setTempname(Temp);

        weatherDTO.setDatename(date);

        servletRequest.setAttribute("weather",weatherDTO);

        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("WeatherResult.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}