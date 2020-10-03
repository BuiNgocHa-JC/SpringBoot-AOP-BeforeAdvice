package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public Employee createEmployee(String empId, String firstName, String secondName) {
        Employee emp = new Employee();
        emp.setEmpId(empId);
        emp.setName(firstName);
        emp.setSecondName(secondName);

        return emp;
    }

    public void deleteEmployee(String empId) {
    }
}
