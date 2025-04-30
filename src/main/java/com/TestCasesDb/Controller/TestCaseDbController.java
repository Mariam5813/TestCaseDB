package com.TestCasesDb.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TestCasesDb.Dto.TestAreaDto;
import com.TestCasesDb.Entity.TestArea;
import com.TestCasesDb.Entity.TestCase;
import com.TestCasesDb.Service.TestAreaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/testarea")
@RequiredArgsConstructor
public class TestCaseDbController {
	
	private final TestAreaService testAreaService;
	
	@PostMapping
    public ResponseEntity<TestArea> save(@RequestBody TestAreaDto testAreaDto) {
        TestArea testArea = testAreaService.save(testAreaDto);
        return ResponseEntity.ok(testArea);
      }
	
	@GetMapping("/{id}")
    public TestArea findById(@PathVariable Integer id) {
        return testAreaService.findById(id);
    }

	@GetMapping
    public Optional<List<TestArea>> findAll() {
        return testAreaService.findAll();
    }

	@DeleteMapping
    public void delete(@RequestBody TestAreaDto testAreaDto) {
        testAreaService.delete(testAreaDto);
    }
	
	
	
//	@Autowired
//	TestCasesService testCasesService;
//	
//	@Autowired
//	TestAreaService testAreaService;
//	
//	
//	//create or post
//		@PostMapping("/test_area")
//		public String create(@RequestBody TestArea testArea) {
//			testAreaService.createTestArea(testArea);
//			
//			return "Test area created successfuly";
//		}
//		
//		
//		// getting all areas
//		@GetMapping("/test_area")
//		public List<TestArea> getAllAreas() {
//			return testAreaService.getAllTestAreas();
//		}
			
	

}
