package com.lugonzo.Springboot101.Controller;

import com.lugonzo.Springboot101.Entity.Student;
import com.lugonzo.Springboot101.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;


/*    to get all students*/
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

  /*  to get a specific student*/
    @RequestMapping(method = RequestMethod.GET,value="/{id}")
    public Student getStudentById(@PathVariable("id") int id){
        return this.studentService.getStudentById(id);
    }

    /*to delete specific student*/
    @RequestMapping(method = RequestMethod.DELETE,value="/{id}")
    public void deleteStudentById(@PathVariable("id") int id){
       studentService.removeStudentById(id);
    }

    /*to update specific student*/
    /*@RequestBody is used to read the body sent (in node express.json()) */
    @RequestMapping(method = RequestMethod.PUT)
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    /*to insert student*/
    @RequestMapping(method = RequestMethod.POST)
    public void insertStudent(@RequestBody Student student){
        studentService.insertStudent(student);
    }
}
