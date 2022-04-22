package com.socialmedia.socialmedia;

public class StudentTeacher {
    private String[] student;
    private  String[] teacher;
    Student stdout=new Student();
    public StudentTeacher(){}
    public StudentTeacher(String[] student,String[] teacher) {
        this.student = student;
        this.teacher = teacher;
    }

//    public StudentTeacher(List<Student> _std)
//    {
//
//    }

    public String[] getStudent() {
        return student;
    }

    public void setStudent(String[] student) {
        this.student = student;
    }

    public String[] getTeacher() {
        return teacher;
    }

    public void setTeacher(String[] teacher) {
        this.teacher = teacher;
    }






}
