package com.StreamAPIandOptional.Service;

import com.StreamAPIandOptional.Model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstName, String lastName, int department);
    Employee remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);
    Collection<Employee> findAll();



    Employee findMinSalaryInDepartment(int department);
    Employee findMaxSalaryInDepartment(int department);
    Collection<Employee> findAllInDepartment(int department);
    Collection<Employee> findAllByDepartments();
    boolean fillEmployees();
}
