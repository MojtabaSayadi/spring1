package com.example.spring1.Controller;

import com.example.spring1.Model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stu")
public class StudentController {
    @GetMapping
     public String student(){
        Student stu1 =new Student();
        stu1.setId(1);
        stu1.setName("ali");
        return  stu1.getName();
    }

   // Student stu2 =new Student();
   // Student stu3 =new Student();
}
