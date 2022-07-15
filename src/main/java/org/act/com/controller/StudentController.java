package org.act.com.controller;

import org.act.com.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getstudent(){
        return new Student("Getu","Kebebe");
    }
    @GetMapping("/students")
    public List<Student> getstudents(){
        List<Student>students = new ArrayList<>();
        students.add(new Student("getu","kebebe"));
        students.add(new Student("jo","yoni"));
        students.add(new Student("abi","Ja"));
        students.add(new Student("yam","sol"));
        return students;
    }

    @GetMapping("{firstname}/{lastname}")
    public Student studentpathvariable(
            @PathVariable("firstname") String firstname,
            @PathVariable("lastname") String lastname){
        return new Student(firstname,lastname);
    }
@GetMapping("student/query")
    public Student studentQueryparm(
            @RequestParam(name ="firstname")String firstname,
            @RequestParam(name="lastname")String lastname){
        return new Student(firstname,lastname);
}
 }
