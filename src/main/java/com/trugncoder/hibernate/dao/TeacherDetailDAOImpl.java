package com.trugncoder.hibernate.dao;

import com.trugncoder.hibernate.entity.TeacherDetail;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDetailDAOImpl implements TeacherDetailDAO {
    private EntityManager entityManager;

    @Autowired
    public TeacherDetailDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(TeacherDetail teacherDetail) {
        entityManager.persist(teacherDetail);

    }
}
