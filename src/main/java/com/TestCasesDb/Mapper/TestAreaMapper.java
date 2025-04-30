package com.TestCasesDb.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import com.TestCasesDb.Dto.TestAreaDto;
import com.TestCasesDb.Entity.TestArea;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TestAreaMapper {
	 TestArea toEntity(TestAreaDto testAreaDto);
}
