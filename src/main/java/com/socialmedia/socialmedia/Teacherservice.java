package com.socialmedia.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class Teacherservice {
    @Autowired
           private TeacherRepository teacherRepository;
    List<Teacher> teachers = new ArrayList<>();

    public void addteacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public List<Teacher> getTeachers() {

        return teacherRepository.findAll();
    }

    public Optional <Teacher> getTeacher(Integer teacher_id) {
        return teacherRepository.findById(teacher_id);
    }
//        Teacher response = null;
//        for (Teacher teacher : teachers) {
//            if (teacher.getTeacher_id().equals(teacher_id)) {
//                response = teacher;
//                break;
//
//            }

//        }



    public Teacher updateTeacher(Teacher teacher, Integer teacher_id) {
        teacher.setTeacher_id(teacher_id);
        return teacherRepository.save(teacher);
    }

//        Teacher response = null;
//        for (Teacher teacher_obj : teachers) {
//            if (teacher_obj.getTeacher_id().equals(teacher_id)) {
//                teacher_obj.setTeacher_name(teacher.getTeacher_name());
//                teacher_obj.setSubject(teacher.getSubject());
//                response = teacher_obj;
//            }
//        }


    public void deleteTeacher(Integer teacher_id) {
        teacherRepository.deleteById(teacher_id);

//        List<Teacher> new_teacher_list = new ArrayList<>();
//        for (Teacher teacher : teachers) {
//            if (!teacher.getTeacher_id().equals(teacher_id)) {
//                new_teacher_list.add(teacher);
//                break;
//            }
//        }
//        teachers = new_teacher_list;
    }
//    public void addStudentTeacher( Teacher[] teacherlist){
//        for (Teacher teacher:teachers){
//            teachers.add(teacher);
//        }
//    }
}

