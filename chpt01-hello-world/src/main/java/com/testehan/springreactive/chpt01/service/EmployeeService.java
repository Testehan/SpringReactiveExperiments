package com.testehan.springreactive.chpt01.service;

import com.testehan.springreactive.chpt01.model.Employee;
import reactor.core.publisher.Flux;

public interface EmployeeService {
    public Flux<Employee> getEmployees();
}