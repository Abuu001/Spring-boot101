package com.lugonzo.Springboot101.Entity;

public class Student {

    private int Id;
    private String Name;
    private String Course;

    public Student() {
    }

    public Student(int id, String name, String course) {
        Id = id;
        Name = name;
        Course = course;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }
}
