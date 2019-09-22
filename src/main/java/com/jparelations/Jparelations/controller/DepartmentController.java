package com.jparelations.Jparelations.controller;

import com.jparelations.Jparelations.model.Department;
import com.jparelations.Jparelations.repo.DeptInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    DeptInterface deptInterface;

    @PostMapping(value = "/savedept")
    public String saveDept(@RequestBody Department department){
        deptInterface.save(department);
        return "Dept saved";
    }
}
