package com.trugncoder.hibernate;

import com.trugncoder.hibernate.dao.*;
import com.trugncoder.hibernate.entity.Student;
import com.trugncoder.hibernate.entity.StudentDetail;
import com.trugncoder.hibernate.entity.Teacher;
import com.trugncoder.hibernate.entity.TeacherDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(
            TeacherDAO teacherDAO, TeacherDetailDAO teacherDetailDAO, StudentDAO studentDAO, StudentDetailDAO studentDetailDAO

            ) {
         return runner -> {
//             createteacher(teacherDAO);
//             createStudent(studentDAO);
//               udateStudent(studentDAO);
                deleteStudent(studentDAO);

         };
    }

    private void deleteStudent(StudentDAO studentDAO) {
        studentDAO.deleteById(2);
    }

    private void udateStudent(StudentDAO studentDAO) {
        Student student = new Student();
        student.setFirstName("Trung");
        student.setLastName("Ho");
        student.setEmail("trung@gmail.com");

        StudentDetail studentDetail = new StudentDetail();
        studentDetail.setAddress("Nong Son");
        studentDetail.setPhone("2345678765");
        studentDetail.setClassName("12c6");
        student.setStudentDetail(studentDetail);
        studentDAO.update(student);

    }

    private void createStudent(StudentDAO studentDAO) {
        Student student = new Student();
        student.setFirstName("Trung");
        student.setLastName("Ho");
        student.setEmail("trung@gmail.com");

        StudentDetail studentDetail = new StudentDetail();
        studentDetail.setAddress("Nong Son");
        studentDetail.setPhone("2345678765");
        student.setStudentDetail(studentDetail);
        studentDAO.save(student);
    }


    private void createteacher(TeacherDAO teacherDAO){
        Teacher teacher = new Teacher();
        teacher.setFirstName("John");
        teacher.setLastName("Doe");
        teacher.setEmail("john.doe@trugncoder.com");

        TeacherDetail teacherDetail = new TeacherDetail();
        teacherDetail.setGender(true);
        teacherDetail.setAddress("Quang Nam");
        teacherDetail.setIdNumber("1324576543");
        teacherDetail.setPhoneNumber("01234567");

        //associaate obj
        teacher.setTeacherDetail(teacherDetail);

        teacherDAO.save(teacher);
        System.out.println("save teacher:  "+teacher);

    }

}
