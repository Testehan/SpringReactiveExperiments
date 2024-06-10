package com.testehan.springreactive.chpt01.service;

import com.testehan.springreactive.chpt01.model.Employee;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Arrays;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public Flux<Employee> getEmployees() {
        // This is for demo purpose only, ideally this data should come from a data-source.
        return Flux.fromIterable(Arrays.asList(new Employee[]{new Employee(1, "Bob", "Marley"),
                new Employee(2, "Cindy", "Breakspeare"),
                new Employee(3, "Tom", "Finson"),
                new Employee(4, "Rupert", "Bent")}));
    }
}
