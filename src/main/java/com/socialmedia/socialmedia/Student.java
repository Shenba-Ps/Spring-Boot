package com.socialmedia.socialmedia;

import javax.persistence.*;

@Entity
@Table(name = "shenba_student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String className;
    public Student(){}
    public Student( String name, String className) {
        this.id = id;
        this.name = name;
        this.className = className;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public void addStudent_ids( Student student, String student_ids){

    }



}
