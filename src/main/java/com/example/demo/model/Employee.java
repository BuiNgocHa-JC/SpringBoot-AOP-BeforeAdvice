package com.example.demo.model;



public class Employee {
    private String empId;
    private String name;
    private String secondName;

    public Employee(String empId, String name, String secondName) {
        this.empId = empId;
        this.name = name;
        this.secondName = secondName;
    }

    public Employee() {
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}