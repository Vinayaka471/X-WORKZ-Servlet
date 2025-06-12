package com.xworkz.servlet;

import com.xworkz.DTO.JobDTO;
import service.JobapplicationImp;
import service.Jobapplictinservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/jobApllication",loadOnStartup = 1)
public class JobServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String type = req.getParameter("type");
        String city = req.getParameter("city");
        String mobile = req.getParameter("mobile");


        JobDTO jobDTO = new JobDTO(name,email,type,city,Long.parseLong(mobile));
        jobDTO.setName(name);
        jobDTO.setEmail(email);
        jobDTO.setType(type);
        jobDTO.setCity(city);
        jobDTO.setMobile(Long.parseLong(mobile));
        System.out.println(jobDTO);








    }
}