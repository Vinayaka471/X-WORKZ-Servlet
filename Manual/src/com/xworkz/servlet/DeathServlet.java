package com.xworkz.servlet;

import com.xworkz.DTO.DeathDTO;
import service.Deathapplicationimp;
import service.Deathapplicationservice;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.sql.Time;
import java.util.Date;

public class DeathServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String name=req.getParameter("name");
        String cause=req.getParameter("cause");
        String date=req.getParameter("date");
        String time=req.getParameter("time");
        String age=req.getParameter("age");
        String certified=req.getParameter("certified");
        String hospital=req.getParameter("hospital");
        String manner=req.getParameter("manner");
        String gender=req.getParameter("gender");
        String marks=req.getParameter("marks");

        DeathDTO deathDTO=new DeathDTO();
        deathDTO.setName(name);
        deathDTO.setCause(cause);
        deathDTO.setDate(date);
        deathDTO.setTime(Time.valueOf(time));
        deathDTO.setAge(Integer.parseInt(age));
        deathDTO.setCertified(certified);
        deathDTO.setHospital(hospital);
        deathDTO.setManner(manner);
        deathDTO.setGender(gender);
        deathDTO.setMarks(marks);
        System.out.println(deathDTO);


        Deathapplicationservice deathapplicationservice = new Deathapplicationimp();
        deathapplicationservice.DeathApplicationValidated(deathDTO);
    }
}
