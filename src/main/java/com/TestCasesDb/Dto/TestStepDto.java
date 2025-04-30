package com.TestCasesDb.Dto;
import lombok.Value;
import com.TestCasesDb.Entity.TestStep;

import java.time.Instant;

/**
 * DTO for {@link TestStep}
 */
@Value
public class TestStepDto {
    Integer id;
    TestCaseDto testCase;
    Integer testcaseId;
    String description;
    byte[] screenshot;
    Instant timeofexecution;

}
