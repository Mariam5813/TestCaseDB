package com.TestCasesDb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TestCasesDb.Entity.TCaseToStep;

public interface TCaseToStepRepository extends JpaRepository<TCaseToStep, Integer> {

}
