package com.java.dojo.recipes.repository;

import com.java.dojo.recipes.model.TestingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestingRepository extends JpaRepository<TestingEntity, Long> {
}
