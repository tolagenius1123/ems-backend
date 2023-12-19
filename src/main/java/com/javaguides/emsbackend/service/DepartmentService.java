package com.javaguides.emsbackend.service;

import com.javaguides.emsbackend.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {

    DepartmentDto createDepartment (DepartmentDto departmentDto);

    DepartmentDto getDepartmentById (Long departmentId);

    List<DepartmentDto> getDepartments ();

    DepartmentDto updateDepartment(Long departmentId, DepartmentDto departmentDto);

    void deleteDepartment (Long departmentId);
}
