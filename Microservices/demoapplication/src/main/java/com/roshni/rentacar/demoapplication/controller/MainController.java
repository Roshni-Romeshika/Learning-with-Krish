package com.roshni.rentacar.demoapplication.controller;

import com.roshni.rentacar.demoapplication.service.StudentService;
import com.roshni.rentacar.demoapplication.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //suppose to route the traffic
public class MainController {

    @Autowired
    StudentService studentService;
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting(){
        return "Hello Springboot";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greetingToPostMethod(){
        return "Hello Springboot from POST method";
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @RequestMapping(value = "student", method = RequestMethod.GET)
    public ResponseEntity<Student> fetchStudentById(@RequestParam int id){
        Student student= studentService.fetchStudentById(id);
        if(student==null){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok().body(student);
        }
    }
}
