package com.xworkz.servlet;

import com.xworkz.DTO.BirthDTO;
import service.BirthapplicationImp;
import service.Birthapplicationservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(urlPatterns ="/Birth Certificate",loadOnStartup=1)
public class BirthServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id= Integer.parseInt(req.getParameter("id"));
        String hospital=req.getParameter("hospital");
        String father=req.getParameter("father");
        String mother=req.getParameter("mother");
        LocalDateTime dateTime= LocalDateTime.parse(req.getParameter("datetime"));
        String doctor=req.getParameter("doctor");
        String nurse=req.getParameter("nurse");
        String type=req.getParameter("type");


        BirthDTO birthDTO=new BirthDTO();
        birthDTO.setId(id);
        birthDTO.setHospital(hospital);
        birthDTO.setFather(father);
        birthDTO.setMother(mother);
        birthDTO.setDatetime(dateTime);
        birthDTO.setDoctor(doctor);
        birthDTO.setNurse(nurse);
        birthDTO.setType(type);
        System.out.println(birthDTO);

        Birthapplicationservice birthapplicationservice = new BirthapplicationImp();
        birthapplicationservice.BirthApplicationValidated(birthDTO);

    }
}
