package com.xworkz.DTO;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BirthDTO implements Serializable {
    private int id;
    private String hospital;
    private String father;
    private String mother;
    private LocalDateTime datetime;
    private String doctor;
    private String nurse;
    private String type;

    public BirthDTO(){
        System.out.println("No args Constructor Created by Tomcat");
    }

    public BirthDTO(int id, String hospital, String father, String mother, LocalDateTime datetime) {
        this.id = id;
        this.hospital = hospital;
        this.father = father;
        this.mother = mother;
        this.datetime = datetime;
        this.doctor=doctor;
        this.nurse=nurse;
        this.type=type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getNurse() {
        return nurse;
    }

    public void setNurse(String nurse) {
        this.nurse = nurse;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BirthDTO{" +
                "id=" + id +
                ", hospital='" + hospital + '\'' +
                ", father='" + father + '\'' +
                ", mother='" + mother + '\'' +
                ", datetime=" + datetime +
                ", doctor='" + doctor + '\'' +
                ", nurse='" + nurse + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

