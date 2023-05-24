package com.exam2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String grade;
    private List<String> courses;
    public Student(String name ,String grade){
        this.name=name;
        this.grade=grade;
        this.courses=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public String getGrade(){
        return grade;
    }

    public List<String> getCourses() {
        return courses;
    }
    public void addCourses(String course){
        courses.add(course);


    }
    public void removeCourses(String course){
        courses.remove(course);
    }

    public static void main(String[] args) {
        Student obj = new Student("BHargav","A");
        System.out.println("Name: "+obj.getName());
        System.out.println("Grade: "+obj.getGrade());
        obj.addCourses("Maths");
        obj.addCourses("Scinece");
        obj.addCourses("English");
        System.out.println(obj.getCourses());
        obj.removeCourses("Scinece");
        System.out.println(obj.getCourses());

    }
}
