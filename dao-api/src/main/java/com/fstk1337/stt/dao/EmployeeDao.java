package com.fstk1337.stt.dao;

import com.fstk1337.stt.model.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();

    Integer create(Employee employee);

    Integer update(Employee employee);

    Integer delete(Integer id);
}
