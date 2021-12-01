package com.generation.model;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class Student
        extends Person
        implements Evaluation {

    private double average;
    public static final float PASS_MIN_GRADE = 3.0f;

    //Create your own Map/List as deem fit
//    enrolledCourses;
     private List <Course> enrolledCourses;
     private Map <String,  Double>  courseGrade;
//    private final List<Course> enrolledCourses = new ArrayList <>();

    public Student(String id, String name, String email, Date birthDate) {
        super(id, name, email, birthDate);
    }
    {  this.enrolledCourses = new ArrayList ();
        this.courseGrade = new HashMap<> ();
    }

    public Map<String, Double> getCourseGrade() {
        return courseGrade;
    }

    public void enrollToCourse(Course course) {
        //TODO implement this method
//This method will check if a student has already enrolled in a course. If not, enroll the student to the course

        if (this.enrolledCourses.size() == 0 || !this.enrolledCourses.contains(course)) {
        this.enrolledCourses.add(course);

           System.out.println("Enrolled Student to Course successfully");
           return;     }
    else
        {  System.out.println("Student already enrolled this course");

        }

    }


    public List<Course> findPassedCourses(Course course) {
        //TODO implement this method

    //    if (this.enrolledCourses.size()
    //    {
        //
     //   }
        return null;
    }

    public Course findCourseById( String courseId ) {
        //TODO implement this method
        //This method returns the particular Course object with the courseId
//        System.out.println(this.enrolledCourses);

        for (int i = 0; i < this.enrolledCourses.size(); i++) {
            if (this.enrolledCourses.get(i).getCode().equals(courseId)) {
        //        System.out.println(this.enrolledCourses.get(i));
                return this.enrolledCourses.get(i);
            }
        }
        return null;
    }

    public void studentCourseGrade ( String courseId, Double grade)
    {
            this.courseGrade.put(courseId,grade);
            System.out.println(courseGrade);
    }

    @Override
    public double getAverage() {
        //TODO implement this method
        return average;
    }

    @Override
    public List<Course> getEnrolledCourses() {
        //TODO implement this method
        return this.enrolledCourses;
    }

    @Override
    public String toString() {
        return "Student {" + super.toString() + "}";
    }
}
