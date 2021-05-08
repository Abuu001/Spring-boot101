package com.lugonzo.Springboot101.Dao;

import com.lugonzo.Springboot101.Entity.Student;

import java.util.Collection;

public interface FakeStudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudent(Student student);
}
