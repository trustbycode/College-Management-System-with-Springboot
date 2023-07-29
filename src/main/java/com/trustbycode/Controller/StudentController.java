package com.trustbycode.Controller;

import com.trustbycode.Entity.Student;
import com.trustbycode.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //hold student form info
    @GetMapping("/students/new-student")
    public String createForm(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_new_students";
    }

    //Model & View with handler method to list student
    @GetMapping("/students")
    public String listStudent(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students"; //from view >> html file
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit";
    }
//Entries from DB
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model){
        Student studentAvailable = studentService.getStudentById(id);
        studentAvailable.setId(id);
        studentAvailable.setFirstName(student.getFirstName());
        studentAvailable.setLastName(student.getLastName());
        studentAvailable.setDepartment(student.getDepartment());
        studentAvailable.setSchoolEmail(student.getSchoolEmail());
        studentService.updateStudent(studentAvailable);
        return "redirect:/students";
    }
//    Delete Entry
    @GetMapping("/students/{id}")
    public String deleteEntry(@PathVariable Long id){
        studentService.deleteEntry(id);
        return "redirect:/students";
    }
}