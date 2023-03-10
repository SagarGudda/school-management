package com.school.management.admin.result;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.school.management.teacher.model.Result;


@FeignClient(name = "result.service")
public interface ResultProxy {
	
	@GetMapping("/getAllResults")
	public List<Result> getAllStudentResults();
	
	@PostMapping("/saveStudentResult")
	public Result saveStudentResult(@RequestBody Result result);

}
