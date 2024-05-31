package com.trugncoder.hibernate.dao;


import com.trugncoder.hibernate.entity.StudentDetail;

public interface StudentDetailDAO {
   public void save(StudentDetail studentDetail);
   public StudentDetail updateStudentDetail(int id);


}
