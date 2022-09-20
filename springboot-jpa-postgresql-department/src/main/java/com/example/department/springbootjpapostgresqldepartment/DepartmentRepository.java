package com.example.department.springbootjpapostgresqldepartment;

import com.example.department.springbootjpapostgresqldepartment.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,Long> {
}
