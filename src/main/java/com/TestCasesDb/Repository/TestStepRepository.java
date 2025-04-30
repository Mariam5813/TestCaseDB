package com.TestCasesDb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TestCasesDb.Entity.TestStep;

public interface TestStepRepository extends JpaRepository<TestStep, Integer> {

}
