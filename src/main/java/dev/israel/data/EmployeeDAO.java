package dev.israel.data;

import dev.israel.entities.Employee;

import java.util.Collection;

public interface EmployeeDAO {

    // Create Employee
    Employee createEmployee(Employee employee);

    // Get Employee
    Employee getEmployeeById(int id);

    // Get all Employees
    Collection<Employee> getAllEmployees();

    // Update Employee
    Employee updateEmployee(Employee employee);

    // Delete Employee
    Boolean deleteEmployeeById(int id);


}
