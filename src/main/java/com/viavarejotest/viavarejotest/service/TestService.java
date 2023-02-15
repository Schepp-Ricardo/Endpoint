package com.viavarejotest.viavarejotest.service;

import com.viavarejotest.viavarejotest.model.Test;
import com.viavarejotest.viavarejotest.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestService {

    @Autowired
    public TestRepository testRepository;

    public List<Test> findAllTests() {
        return testRepository.findAll();
    }

    public Test saveTestOnRepo(Test t) {

        return testRepository.save(t);
    }
}
