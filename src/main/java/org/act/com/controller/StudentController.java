package org.act.com.controller;

import org.act.com.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getstudent(){
        return new Student("Getu","Kebebe");
    }

}
