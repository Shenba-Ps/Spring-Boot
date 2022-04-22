//package com.socialmedia.socialmedia;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class StudentTeacherController {
//    @Autowired
//    private Studentservice studentservice;
//    private Teacherservice teacherservice;
//    @RequestMapping(method = RequestMethod.POST,value = "/studentteacher")
//    public void addStudentTeacher(@RequestBody StudentTeacher studentTeacher){
//        studentservice.addStudentTeacher(studentTeacher.getStudent());
//
//
//    }
//    @RequestMapping(method = RequestMethod.GET,value = ("/studentteacher"))
//    public List<StudentTeacher> getstudentteacher(){
//        return studentservice.getstudentteacher();
//
//    }
//}
