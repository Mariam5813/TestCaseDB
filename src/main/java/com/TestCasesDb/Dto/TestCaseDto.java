package com.TestCasesDb.Dto;

import java.time.Instant;

import lombok.Value;
/**
 * DTO for {@link org.mt.mttest.entity.TestCase}
 */
@Value
public class TestCaseDto {
	Integer id;
    TestAreaDto testArea;
    String name;
    String result;
    String testname;
    Instant timeofexecution;
    Integer areaId;
    String assumptions;
}
