package com.java.dojo.recipes.controller;

import com.java.dojo.recipes.model.TestingEntity;
import com.java.dojo.recipes.repository.TestingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/recipes")
@RestController
public class TestingController {

    private final TestingRepository testingRepository;

    public TestingController(TestingRepository testingRepository) {
        this.testingRepository = testingRepository;
    }

    @GetMapping
    public String testingGet() {
        return "Recipes API working fine...";
    }

    @PostMapping
    public TestingEntity testingPost(@RequestBody final TestingEntity testingEntity) {
        return testingRepository.save(testingEntity);
    }
}
