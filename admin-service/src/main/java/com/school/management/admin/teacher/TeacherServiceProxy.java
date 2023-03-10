package com.school.management.admin.teacher;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.school.management.teacher.model.TeacherModel;

@FeignClient(name = "teacher.service")
public interface TeacherServiceProxy {
	
	@PostMapping("/saveTeacherDetails")
	public void createTeacher(@RequestBody TeacherModel tm);
	
	@GetMapping("/getAllTeacherDetails")
	public List<TeacherModel> getAllTeacherDetails();

}
