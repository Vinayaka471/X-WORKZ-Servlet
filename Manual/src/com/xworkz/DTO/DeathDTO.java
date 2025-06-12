package com.xworkz.DTO;

import java.io.Serializable;
import java.sql.Time;

public class DeathDTO implements Serializable {
    private String name;
    private String cause;
    private String date;
    private Time time;
    private int age;
    private String certified;
    private String hospital;
    private String manner;
    private String gender;
    private String marks;

    public DeathDTO(){
        System.out.println("No argument constructor created by Tomcat");
    }
    public DeathDTO(String name, String cause, String date, Time time, int age, String certified, String hospital, String manner){
        this.name=name;
        this.cause=cause;
        this.date=date;
        this.time=time;
        this.age=age;
        this.certified=certified;
        this.hospital=hospital;
        this.manner=manner;
        this.gender=gender;
        this.marks=marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getCertified() {
        return certified;
    }

    public void setCertified(String certified) {
        this.certified = certified;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getManner() {
        return manner;
    }

    public void setManner(String manner) {
        this.manner = manner;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "DeathDTO{" +
                "name='" + name + '\'' +
                ", cause='" + cause + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", age=" + age +
                ", certified='" + certified + '\'' +
                ", hospital='" + hospital + '\'' +
                ", manner='" + manner + '\'' +
                ", gender='" + gender + '\'' +
                ", marks='" + marks + '\'' +
                '}';
    }
}


