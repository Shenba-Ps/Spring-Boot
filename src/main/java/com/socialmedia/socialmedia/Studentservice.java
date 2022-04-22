package com.socialmedia.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Studentservice {
    @Autowired
    private StudentRepository studentRepository;
//    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        studentRepository.save(student);

    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }


    public Optional<Student> getStudent(Integer student_id) {
        return studentRepository.findById(student_id);


    }

//        return studentRepository.findBy(student_id);
//    }
////        Student response = null;
////        for (Student student : students) {
////            if (student.getId().equals(student_id)) {
////                response = student;
////                break;
////            }
////
////        }
//
//
//
//
    public Student updateStudent(Student student, Integer student_id) {
        student.setId(student_id);
        return studentRepository.save(student);
    }

////        Student response = null;
////        for (Student student_obj : students) {
////            if (student.getId().equals(student_id)) {
////                student_obj.setName(student.getName());
////                student_obj.setClassName(student.getClassName());
////                response = student_obj;
////                break;
////            }
////        }
////        return response;
////    }
//
    public void deleteStudent(Integer student_id) {
    studentRepository.deleteById(student_id);
    }
}
//  //      List<Student> new_student_list = new ArrayList<>();
//        for (Student student : students) {
////            if (!student.getId().equals(student_id)) {
////                new_student_list.add(student);
////                break;
//
//            if (student.getId().equals(student_id)) {
//                students.remove(student);
//                break;
//            }
//        }
////        students = new_student_list;
//    }
//
//    public List<Student> getStudents(String[] student_id) {
//        List<Student> students1 = new ArrayList<>();
//        for (Student student : students) {
//            for (int i = 0; i < student_id.length; i++) {
//                if (student.getId().equals(student_id[i])) {
//                    students1.add(student);
//                }
//            }
//        }
//        return students1;
//
//    }
//
//    public List<Customstudent> customstudentList(String[] student_id) {
//        List<Customstudent> newList = new ArrayList<>();
//        for (Student student : students) {
//            for (int i = 0; i < student_id.length; i++) {
//                if (student.getId().equals(student_id[i])) {
//                    Customstudent customstudent1 = new Customstudent(student.getId(), student.getName());
//                   newList.add(customstudent1);
//                }
//            }
//        }
//        return newList;
//    }
//
//    public List<Student> getstudentname(String[] student_name) {
//        List<Student> studentList = new ArrayList<>();
//        for (Student student : students) {
//            for (int i = 0; i < student_name.length; i++) {
//                if (student.getName().equals(student_name[i])) {
//                    studentList.add(student);
//                }
//
//            }
//
//        }
//        return studentList;
//    }
//    List<StudentTeacher> studentList1=new ArrayList<>();
//    public void addStudentTeacher(String[] student){
//
//        for (StudentTeacher studentteach:studentList1) {
////
//                studentList1.add(studentteach);
//
////
//        }
//
//    }
//    public List<StudentTeacher> getstudentteacher(){
//        return studentList1;
//
//
//    }
//}



//    List<Student> studentids = new ArrayList<Student>();

//List<String> list=new ArrayList<>();
//List<Student> studentList=new ArrayList<>();
//    public void addStudent_ids( Student student) {
//        students.add(student);
//
//    }

//    public List<Student> getStudents_id( String[] student_ids) {
//        Student response = null;
//        for (Student s : students) {
//            if (s.getId().equals(student_ids)) {
//                response = s;
//                break;
//            }
//        }return response;









//    public List<Student> getStudentsids(Student student,String[] student_ids){
//        Student response=null;
//        for (Student s:students){
//            if (s.getId().equals(student_ids)){
//                response=s;
//                break;
//            }
//
//        }return (List<Student>) response;





