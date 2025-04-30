package com.TestCasesDb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TestCasesDb.Entity.TestArea;
import com.TestCasesDb.Entity.TestCase;

public interface TestAreaRepository extends JpaRepository<TestArea, Integer>{

}
