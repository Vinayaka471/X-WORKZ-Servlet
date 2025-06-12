package com.xworkz.DTO;

import java.io.Serializable;
import java.util.Date;

public class MarriageDTO implements Serializable {
    private String Groomname;
    private String Bridename;
    private String Location;
    private String Address;
    private String Religion;
    private Date date;
    private String Witness1;
    private String Witness2;
    private String Officer;

    public MarriageDTO(){
        System.out.println("No arguments constructed by tomcat");

    }
    public MarriageDTO(String Groomname,String Bridename,String Location,String Address,String Religion, Date date, String Witness1,String Witness2, String Officer){
        this.Groomname=Groomname;
        this.Bridename=Bridename;
        this.Location=Location;
        this.Address=Address;
        this.Religion=Religion;
        this.Date=Date;
        this.Witness1=Witness1;
        this.Witness2=Witness2;
        this.Officer=Officer;
    }

}
