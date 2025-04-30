package com.TestCasesDb.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import com.TestCasesDb.Dto.TCaseToStepDto;
import com.TestCasesDb.Entity.TCaseToStep;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TCaseToStepMapper  {
	TCaseToStep toEntity(TCaseToStepDto TCaseToStepDto);

}
