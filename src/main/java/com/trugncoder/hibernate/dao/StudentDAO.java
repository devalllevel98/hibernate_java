package com.trugncoder.hibernate.dao;

import com.trugncoder.hibernate.entity.Student;

public interface StudentDAO {
    public void save(Student student);
    public Student getStudentById(int id);
    public Student update(Student student);
    public void deleteById(int id);
}
