package com.company;

import com.company.interfaces.Student;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(1, "sahil", "Rajpura");
        System.out.println(student.getStudentName() + "\n" + student.getAddress() + "\n" + student.getStudentId());
        student.setAddress("Patiala");
        System.out.println(student.getAddress());
    }
}
