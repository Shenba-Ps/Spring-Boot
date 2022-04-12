package com.socialmedia.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Teachertest {
    @Autowired
            Teacherservice teacherservice;

    @RequestMapping(method = RequestMethod.POST,value = "/teacher")
    public void addteacher(@RequestBody Teacher teacher){
        teacherservice.addteacher(teacher);
    }
    @RequestMapping(method = RequestMethod.GET,value = ("/teacher"))
    public List<Teacher> getTeachers(){
        return teacherservice.getTeachers();
    }
    @RequestMapping(method = RequestMethod.GET,value = "/teacher/{teacher_id}")
    public Teacher getTeacher(@PathVariable ("teacher_id")String teacher_id ){
        return teacherservice.getTeacher(teacher_id);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/teacher/{teacher_id}")
    public  Teacher updateTeacher(@RequestBody Teacher teacher,@PathVariable("teacher_id")String teacher_id){
       return teacherservice.updateTeacher(teacher,teacher_id);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/teacher/{teacher_id}")
    public void deleteTeacher(@PathVariable("teacher_id")String teacher_id){
        teacherservice.deleteTeacher(teacher_id);
    }

}
