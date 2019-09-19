package com.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2019/4/23
 * version:
 * update:
 */
public class Student {
    private String name;
    private int age;
    private List<Course> courseList;//课程

    public Student(){}

    public Student(String name, List<Course> courseList) {
        this.name = name;
        this.courseList = courseList;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Builder{
        private Student student;

        public Builder(String name){
            student = new Student();
            student.setName(name);
        }

        public Builder setAge(int age){
            student.setAge(age);
            return this;
        }

        public Builder setCourse(Course course){
            if(student.getCourseList() == null){
                student.courseList = new ArrayList<>();
            }
            student.courseList.add(course);
            return this;
        }

        public Student build(){
            return student;
        }
    }
}
