package com.lugonzo.Springboot101;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class CoursesController {

    @ResponseBody //to return data
    @RequestMapping("/courses")
    public  String Courses(HttpServletRequest req){

        String courseName = req.getParameter("cname");
        System.out.println(courseName);
        System.out.println("Welcome to eduerka");
        return ("Welcome to courses ".toUpperCase() + courseName);
    }
}
