package com.lugonzo.Springboot101.Dao;

import com.lugonzo.Springboot101.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("FakeData")
public class StudentDao implements StudentDaoInterface, FakeStudentDao {

    private static Map<Integer, Student> students;
    static{
        students = new HashMap<Integer,Student>(){
            {
                put(1,new Student(1,"said","Comp science"));
                put(2,new Student(2,"peter","BBIT"));
                put(3,new Student(3,"Kian","IT"));
            }

        };
    }

  @Override
  public Collection<Student> getAllStudents(){
        return this.students.values();
  }

  @Override
  public Student getStudentById(int id){
        return this.students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        students.remove(id);
    }


    @Override
    public void updateStudent(Student student){
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());

        //putting it back to db
        students.put(student.getId(),student);
    }

    @Override
    public void insertStudent(Student student){
        students.put(student.getId(),student);
    }
}
