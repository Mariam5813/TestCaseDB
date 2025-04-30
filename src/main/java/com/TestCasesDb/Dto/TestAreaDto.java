package com.TestCasesDb.Dto;

import lombok.Value;

/**
 * DTO for {@link org.mt.mttest.entity.TestArea}
 */
@Value
public class TestAreaDto {
    Integer id;
    TestCaseDto testCase;
    String description;
}
