package com.example.department.springbootjpapostgresqldepartment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository deptRepository;

    @Override
    public Department saveDepartment(Department department) {
        return deptRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return (List<Department>)deptRepository.findAll();
    }

    @Override
    public Department
    updateDepartment(Department department, Long departmentId)
    {
        Department depDB = deptRepository.findById(departmentId).get();

        if (Objects.nonNull(department.getDepartment_name())
                && !"".equalsIgnoreCase(
                department.getDepartment_name())) {
            depDB.setDepartment_name(
                    department.getDepartment_name());
        }

        if (Objects.nonNull(department.getDepartment_address())
                && !"".equalsIgnoreCase(
                department.getDepartment_address())) {
            depDB.setDepartment_address(
                    department.getDepartment_address());
        }

        if (Objects.nonNull(department.getDepartment_code())
                && !"".equalsIgnoreCase(
                department.getDepartment_code())) {
            depDB.setDepartment_code(
                    department.getDepartment_code());
        }

        return deptRepository.save(depDB);
    }


    @Override
    public void deleteDepartmentById(Long department_id) {
       deptRepository.deleteById(department_id);

    }
}
