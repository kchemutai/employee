package com.hopeoutreachministries.employee.repo;

import com.hopeoutreachministries.employee.modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    Employee findEmployeeById(Long employeeId);
}
