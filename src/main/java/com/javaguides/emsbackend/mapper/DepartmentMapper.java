package com.javaguides.emsbackend.mapper;

import com.javaguides.emsbackend.dto.DepartmentDto;
import com.javaguides.emsbackend.entity.Department;

public class DepartmentMapper {

    // Convert department jpa entity into department dto
    public static DepartmentDto mapToDepartmentDto(Department department) {
        DepartmentDto departmentDto = new DepartmentDto(
                department.getDepartmentId(),
                department.getDepartmentName(),
                department.getDepartmentDescription()
        );
        return departmentDto;
    }

    // Convert department dto into department jpa entity
    public static Department mapToDepartment(DepartmentDto departmentDto) {
        Department department = new Department(
                departmentDto.getDepartmentId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription()
        );
        return department;
    }

}