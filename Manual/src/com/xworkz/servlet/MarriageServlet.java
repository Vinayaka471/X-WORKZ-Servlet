package com.xworkz.servlet;

import com.xworkz.DTO.MarriageDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MarriageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Groomname=req.getParameter("Groomname");
        String Bridename=req.getParameter("Bridename");
        String Location=req.getParameter("Location");
        String Address=req.getParameter("Address");
        String Religion=req.getParameter("Religion");
        String Date=req.getParameter("date");
        String Witness1=req.getParameter("Witness1");
        String Witness2=req.getParameter("Witness2");
        String Officer=req.getParameter("Officer");

        MarriageDTO marriageDTO=new MarriageDTO();
        marriageDTO.setGroomname(Groomname);
        marriageDTO.setBridename(Bridename);
        marriageDTO.setLocation(Location);
        marriageDTO.setAddress(Address);
        marriageDTO.setReligion(Religion);
        marriageDTO.setDate(Date);
        marriageDTO.setWitness1(Witness1);
        marriageDTO.setWitness2(Witness2);
        marriageDTO.setOfficer(Officer);


    }
}
