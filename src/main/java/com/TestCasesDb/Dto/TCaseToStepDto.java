package com.TestCasesDb.Dto;
import lombok.Value;
import com.TestCasesDb.Entity.TCaseToStep;


/**
 * DTO for {@link TCaseToStep}
 */
@Value
public class TCaseToStepDto {
	Integer id;
    TestCaseDto tc;
    TestStepDto ts;
}
