package com.socialmedia.socialmedia;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@Service

public class Teacherservice {
    List<Teacher> teachers = new ArrayList<>();

    public void addteacher(Teacher teacher) {

        teachers.add(teacher);
    }

    public List<Teacher> getTeachers() {

        return teachers;
    }

    public Teacher getTeacher(String teacher_id) {
        Teacher response = null;
        for (Teacher teacher : teachers) {
            if (teacher.getTeacher_id().equals(teacher_id)) {
                response = teacher;
                break;

            }

        }
        return response;
    }

    public Teacher updateTeacher(Teacher teacher, String teacher_id) {
        Teacher response = null;
        for (Teacher teacher_obj : teachers) {
            if (teacher_obj.getTeacher_id().equals(teacher_id)) {
                teacher_obj.setTeacher_name(teacher.getTeacher_name());
                teacher_obj.setSubject(teacher.getSubject());
                response = teacher_obj;
            }
        }
        return response;
    }

    public void deleteTeacher(String teacher_id) {
        List<Teacher> new_teacher_list = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (!teacher.getTeacher_id().equals(teacher_id)) {
                new_teacher_list.add(teacher);
                break;
            }
        }
        teachers = new_teacher_list;
    }
}

