package com.socialmedia.socialmedia;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class Studentservice {
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {

        students.add(student);
    }

    public List<Student> getStudents() {

        return students;
    }

    public Student getStudent(String student_id) {
        Student response = null;
        for (Student student : students) {
            if (student.getId().equals(student_id)) {
                response = student;
                break;
            }

        }
        return response;

    }

    public Student updateStudent(Student student, String student_id) {
        Student response = null;
        for (Student student_obj : students) {
            if (student.getId().equals(student_id)) {
                student_obj.setName(student.getName());
                student_obj.setClassName(student.getClassName());
                response = student_obj;
                break;
            }
        }
        return response;
    }

    public void deleteStudent( String student_id) {
        List<Student> new_student_list = new ArrayList<>();
        for (Student student : students) {
            if (!student.getId().equals(student_id)) {
                new_student_list.add(student);
                break;
            }
        }
        students = new_student_list;
    }
}
