package com.school.management.admin.classroutine;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.school.management.teacher.model.ClassRoutine;


@FeignClient(name = "class.routine.service")
public interface ClassRoutineProxy {
	
	@GetMapping("/getAllClassRoutine")
	public List<ClassRoutine> getAllClassRoutine();
	
	@PostMapping("/addClassRoutine")
	public ClassRoutine addClassRoutine(@RequestBody ClassRoutine classRoutine);
	
	
}
