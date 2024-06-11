package com.testehan.springreactive.chpt01.controller;

import com.testehan.springreactive.chpt01.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.result.view.Rendering;
import reactor.core.publisher.Mono;

@Controller
public class HomeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public Mono<Rendering> home() {
        var employees = employeeService.getEmployees();
        return Mono.just(Rendering.view("index")
                .modelAttribute("employees", employees).build());
    }
}
