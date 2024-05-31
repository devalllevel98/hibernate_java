package com.trugncoder.hibernate.dao;

import com.trugncoder.hibernate.entity.StudentDetail;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDetailDAOIpm  implements StudentDetailDAO {
    private EntityManager entityManager;
    @Autowired
    public StudentDetailDAOIpm(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(StudentDetail studentDetail) {
        entityManager.persist(studentDetail);
    }

    @Override
    @Transactional
    public StudentDetail updateStudentDetail(int id) {
        return entityManager.find(StudentDetail.class, id);
    }
}
