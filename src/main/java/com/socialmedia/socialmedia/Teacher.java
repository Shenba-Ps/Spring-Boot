package com.socialmedia.socialmedia;


public class Teacher {
    private String teacher_id;
    private String teacher_name;
    private String subject;
    Teacher(){}

    public Teacher(String teacher_id, String teacher_name, String subject) {
        this.teacher_id = teacher_id;
        this.teacher_name = teacher_name;
        this.subject = subject;
    }
    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }





}
