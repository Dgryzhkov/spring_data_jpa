package com.dgryzhkov.spring.springboot.spring_data_jpa.dao;



import com.dgryzhkov.spring.springboot.spring_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * @author Dgryzhkov
 */
public interface  EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByName(String name);

}
