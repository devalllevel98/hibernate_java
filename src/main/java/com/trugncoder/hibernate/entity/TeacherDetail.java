package com.trugncoder.hibernate.entity;

import jakarta.persistence.*;
import org.springframework.cglib.core.Block;

import java.sql.Blob;

@Entity
@Table(name="teacher_detail")
public class TeacherDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;



    @Column(name="phone_number", length = 15)
    private String phoneNumber;

    @Column(name="address")
    private String address;

    @Column(name="gender")
    private boolean gender;

    @Column(name="salary")
    private double salary;

    @Column(name="id_number")
    private String idNumber;

    @Lob
    @Column(name="avatar")
    private Blob avatar;

    public TeacherDetail() {
    }

    public TeacherDetail(int id, String phoneNumber, String address, boolean gender, double salary, String idNumber, Blob avatar) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.salary = salary;
        this.idNumber = idNumber;
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Blob getAvatar() {
        return avatar;
    }

    public void setAvatar(Blob avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "TeacherDetail{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", idNumber='" + idNumber + '\'' +
                ", avatar=" + avatar +
                '}';
    }
}
