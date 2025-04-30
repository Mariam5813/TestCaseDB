package com.TestCasesDb.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestCasesDb.Dto.TestAreaDto;
import com.TestCasesDb.Entity.TestArea;
import com.TestCasesDb.Mapper.TestAreaMapper;
import com.TestCasesDb.Repository.TestAreaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestAreaService {
	
	
	 private final TestAreaRepository testAreaRepository;

    
	 private final TestAreaMapper testAreaMapper;
    
    public void delete(TestAreaDto testAreaDto) {
        TestArea testArea = testAreaMapper.toEntity(testAreaDto);
        testAreaRepository.delete(testArea);
    }

    public Optional<List<TestArea>> findAll() {
        List<TestArea> testAreas = testAreaRepository.findAll();
        return Optional.ofNullable(testAreas);
    }

    public TestArea findById(Integer id) {
        Optional<TestArea> testAreaOptional = testAreaRepository.findById(id);
        return testAreaOptional.orElse(null);
    }

    public TestArea save(TestAreaDto testAreaDto) {
        TestArea testArea = testAreaMapper.toEntity(testAreaDto);
        return testAreaRepository.save(testArea);
    }
	

}
