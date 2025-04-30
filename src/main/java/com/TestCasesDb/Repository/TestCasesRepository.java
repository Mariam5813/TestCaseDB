package com.TestCasesDb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TestCasesDb.Entity.TestCase;

public interface TestCasesRepository extends JpaRepository<TestCase, Integer> {

}
