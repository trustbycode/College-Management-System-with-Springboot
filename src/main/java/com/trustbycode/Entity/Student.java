package com.trustbycode.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "student")
public class Student {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //primary generated value
    private Long id;

    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "Department")
    private String department;

    @Column(name = "School_Email")
    private String schoolEmail;

    public Student() {
    }

    public Student(String firstName, String lastName, String department, String schoolEmail) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.schoolEmail = schoolEmail;
    }
}