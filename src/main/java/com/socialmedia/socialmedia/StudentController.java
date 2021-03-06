package com.socialmedia.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
   private Studentservice studentservice;


    @RequestMapping (method = RequestMethod.POST,value = "/student")
    public void addStudent(@RequestBody Student student){

        studentservice.addStudent(student);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/student")
    public List<Student> getStudents(){
        return studentservice.getStudents();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/student/{student_id}")
    public Optional<Student> getStudent(@PathVariable("student_id")Integer student_id){
       return studentservice.getStudent(student_id);
    }
//
//
    @RequestMapping(method = RequestMethod.PUT,value = "/student/{student_id}")
    public Student updateStudent(@RequestBody Student student,@PathVariable("student_id")Integer student_id){
      return studentservice.updateStudent(student,student_id);
        }
//
//
    @RequestMapping(method = RequestMethod.DELETE,value = "/student/{student_id}")
    public void deleteStudent(@PathVariable("student_id")Integer student_id){
       studentservice.deleteStudent(student_id);
    }
//
//    @RequestMapping(method = RequestMethod.POST,value = "/students")
//    public List<Student> getStudents(@RequestBody  Studentbyids student_ids){
//        List<Student> StudentRecords =  studentservice.getStudents(student_ids.getIds());
//        return StudentRecords;
//    }
//    @RequestMapping(method = RequestMethod.POST,value = "/studentcus")
//    public List<Customstudent> customstudentList(@RequestBody Studentbyids studentbyids){
//       return studentservice.customstudentList(studentbyids.getIds());
//    }
//    @RequestMapping(method = RequestMethod.POST,value = "/stuname")
//    public List<Student> getstudentname(@RequestBody StudentName studentName){
//        return studentservice.getstudentname(studentName.getName());
//
//    }

}




//   {ids:[33,44]}

//   [{};{}]


