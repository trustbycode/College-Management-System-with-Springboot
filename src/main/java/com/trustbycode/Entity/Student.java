package com.trustbycode.Entity;

import jakarta.persistence.*;

@Entity
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSchoolEmail() {
        return schoolEmail;
    }

    public void setSchoolEmail(String schoolEmail) {
        this.schoolEmail = schoolEmail;
    }
}