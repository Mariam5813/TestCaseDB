package com.TestCasesDb.Controller;


import lombok.RequiredArgsConstructor;
import com.TestCasesDb.Dto.TCaseToStepDto;
import com.TestCasesDb.Entity.TCaseToStep;
import com.TestCasesDb.Mapper.TCaseToStepMapper;
import com.TestCasesDb.Repository.TCaseToStepRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/mttest/tcasetostep")
@RequiredArgsConstructor
public class TCaseToStepController {
	
	private final TCaseToStepRepository TCaseToStepRepository;

    private final TCaseToStepMapper TCaseToStepMapper;
    
    
    @DeleteMapping
    public void deleteById(@RequestBody Integer id) {
        TCaseToStepRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<TCaseToStep> findById(@PathVariable Integer id) {
        return TCaseToStepRepository.findById(id);
    }

    @PostMapping
    public TCaseToStep save(@RequestBody TCaseToStep entity) {
        return TCaseToStepRepository.save(entity);
    }

    @PostMapping
    public TCaseToStep save(@RequestBody TCaseToStepDto TCaseToStepDto) {
        TCaseToStep TCaseToStep = TCaseToStepMapper.toEntity(TCaseToStepDto);
        return TCaseToStepRepository.save(TCaseToStep);
    }
    
}
