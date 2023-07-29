package com.trustbycode.Service;

import com.trustbycode.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents(); //List student

    Student saveStudent(Student student);

    Student editStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteEntry(Long id);
}
