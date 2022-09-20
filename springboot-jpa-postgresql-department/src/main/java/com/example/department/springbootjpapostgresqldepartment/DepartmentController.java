package com.example.department.springbootjpapostgresqldepartment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService deptService;

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
        return deptService.saveDepartment (department);
    }

    @GetMapping("/department")
    public List<Department> fetchDepartmentList(){
        return deptService .fetchDepartmentList();
    }

    @PutMapping("/department/{id}")
    public  Department updateDepartment(@RequestBody Department department, @PathVariable("id") Long department_id){
        return deptService.updateDepartment(department,department_id);

    }
    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long department_id){
         deptService.deleteDepartmentById(department_id);
         return"Deleted successfully";
    }
}
