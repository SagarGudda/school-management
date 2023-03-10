package com.school.management.result;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.management.result.dao.ResultDao;
import com.school.management.result.model.Result;

@RestController
public class ResultController {
	
	@Autowired
	ResultDao resultDao;

	
	@GetMapping("/getAllResults")
	public List<Result> getAllStudentResults() {
		return resultDao.getAllStudentResults();
	}
	
	@GetMapping("/getStudentResultByRollNumber/{rollNumber}")
	public Result getStudentResultByRollNumber(@PathVariable long rollNumber) {
		return resultDao.getStudentResultByRollNumber(rollNumber);
	}
	
	@PostMapping("/saveStudentResult")
	public Result saveStudentResult(@RequestBody Result result) {
		return resultDao.saveStudentResult(result);
	}
	
}
