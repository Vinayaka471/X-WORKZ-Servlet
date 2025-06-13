package com.xworkz.DTO;

import java.io.Serializable;

public class MarriageDTO implements Serializable {
    private String Groomname;
    private String Bridename;
    private String Location;
    private String Address;
    private String Religion;
    private String date;
    private String Witness1;
    private String Witness2;
    private String Officer;

    public MarriageDTO(){
        System.out.println("No arguments constructed by tomcat");

    }
    public MarriageDTO(String Groomname, String Bridename, String Location, String Address, String Religion, String date, String Witness1, String Witness2, String Officer){
        this.Groomname=Groomname;
        this.Bridename=Bridename;
        this.Location=Location;
        this.Address=Address;
        this.Religion=Religion;
        this.date=date;
        this.Witness1=Witness1;
        this.Witness2=Witness2;
        this.Officer=Officer;
    }

    public String getGroomname() {
        return Groomname;
    }

    public void setGroomname(String groomname) {
        Groomname = groomname;
    }

    public String getBridename() {
        return Bridename;
    }

    public void setBridename(String bridename) {
        Bridename = bridename;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getReligion() {
        return Religion;
    }

    public void setReligion(String religion) {
        Religion = religion;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWitness1() {
        return Witness1;
    }

    public void setWitness1(String witness1) {
        Witness1 = witness1;
    }

    public String getWitness2() {
        return Witness2;
    }

    public void setWitness2(String witness2) {
        Witness2 = witness2;
    }

    public String getOfficer() {
        return Officer;
    }

    public void setOfficer(String officer) {
        Officer = officer;
    }
}
