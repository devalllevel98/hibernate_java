package com.trugncoder.hibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_detail")
public class StudentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;
    @Column(name = "class_name")
    private String className;

    public StudentDetail() {
    }

    public StudentDetail(int id, String phone, String address, String className) {
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "StudentDetail{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
