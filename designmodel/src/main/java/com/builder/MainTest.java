package com.builder;

/**
 * Desc:建造者模式
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2019/7/16
 * version:
 * update:
 */
public class MainTest {

    public static void main(String[] args){
        Student student =
                new Student.Builder("yl")
                .setAge(11)
                .setCourse(new Course("English"))
                .build();
        System.out.println(student.getName());
        System.out.println(student.getAge());
        for(Course course : student.getCourseList()){
            System.out.println(course.getCourseName());
        }
    }
}
