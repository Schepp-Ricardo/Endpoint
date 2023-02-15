package com.viavarejotest.viavarejotest.controllers;

import com.viavarejotest.viavarejotest.model.Test;
import com.viavarejotest.viavarejotest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    public TestService testService;

    @GetMapping
    public List<Test> findA() {
        return testService.findAllTests();
    }

    @PostMapping
    public Test newTest(@RequestBody Test t) {
        return testService.saveTestOnRepo(t);
    }

}
