package com.school.management.admin.student;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.school.management.teacher.model.StudentModel;


@FeignClient(name = "student.service")
public interface StudentServiceProxy {
	
	@PostMapping("/saveStudentDetails")
	public void createStudent(@RequestBody StudentModel tm);
	
	@GetMapping("/getAllStudentDetails")
	public List<StudentModel> getAllStudentDetails();
	
	
}
