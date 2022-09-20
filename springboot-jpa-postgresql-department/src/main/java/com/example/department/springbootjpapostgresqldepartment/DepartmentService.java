package com.example.department.springbootjpapostgresqldepartment;

import com.example.department.springbootjpapostgresqldepartment.Department;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department>fetchDepartmentList();

    Department updateDepartment(Department department, Long department_id);

    void deleteDepartmentById(Long department_id);
}
