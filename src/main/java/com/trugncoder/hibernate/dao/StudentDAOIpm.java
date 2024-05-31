package com.trugncoder.hibernate.dao;


import com.trugncoder.hibernate.entity.Student;
import com.trugncoder.hibernate.entity.StudentDetail;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOIpm implements StudentDAO {
    private EntityManager entityManager;
    @Autowired
    public StudentDAOIpm(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student getStudentById(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    @Transactional
    public Student update(Student student) {
        return entityManager.merge(student);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Student student = entityManager.find(Student.class, id);
         entityManager.remove(student);
    }
}
