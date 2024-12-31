package com.abc.ems.service;

import com.abc.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    //add a new employee
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    //get an employee
    EmployeeDto getEmployeeById(long id);

    //get all employees
    List<EmployeeDto> getAllEmployees();

    //update an employee
    EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);

    //delete an employee by id
    void deleteEmployeeById(Long id);
}

