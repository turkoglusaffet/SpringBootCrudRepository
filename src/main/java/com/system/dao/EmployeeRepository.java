package com.system.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.system.model.Employee;


@Transactional
public interface EmployeeRepository  extends CrudRepository<Employee, Long> {

	  public Employee findByEmail(String email);
}
