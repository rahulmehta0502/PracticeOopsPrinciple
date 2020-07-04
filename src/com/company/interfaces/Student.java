package com.company.interfaces;

public class Student {
    Integer studentId;
    String studentName;
    String address;

    public Student(Integer studentId, String studentName, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
    }

    public String getStudentName(){
        return studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
}

