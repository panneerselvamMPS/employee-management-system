package com.mini.project.employee.service;

import java.util.List;

import com.mini.project.employee.model.Employee;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    void save(Employee employee);

    Employee getById(Long id);

    void deleteById(Long ids);
}
