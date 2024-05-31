package com.trugncoder.hibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name="teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id;


    @Column(name="first_name", length = 256)
    private String firstName;

    @Column(name="last_name", length=256)
    private String lastName;

    @Column(name="email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="teacher_detail_id", referencedColumnName = "id")
    private TeacherDetail teacherDetail;

    public Teacher() {
    }

    public Teacher(int id, String firstName, String lastName, String email, TeacherDetail teacherDetail) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.teacherDetail = teacherDetail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TeacherDetail getTeacherDetail() {
        return teacherDetail;
    }

    public void setTeacherDetail(TeacherDetail teacherDetail) {
        this.teacherDetail = teacherDetail;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", teacherDetail=" + teacherDetail +
                '}';
    }
}
