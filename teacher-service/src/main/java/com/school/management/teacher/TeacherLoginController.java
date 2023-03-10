package com.school.management.teacher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.school.management.teacher.model.TeacherModel;
import com.school.management.teacher.service.TeacherService;

@RestController
public class TeacherLoginController {
	
	@Autowired
	TeacherService teacherService;
	
	@GetMapping("/login")
	public ModelAndView login() {
		TeacherModel tl=new TeacherModel();
		return new ModelAndView("login");
	}
	
	@PostMapping("/saveTeacherDetails")
	public void createTeacher(@RequestBody TeacherModel tm) {
		teacherService.saveTeacherDetails(tm);
	}
	
	@GetMapping("/getAllTeacherDetails")
	public List<TeacherModel> getAllTeacherDetails() {
		return teacherService.findAllTeacherDetails();
	}
	
	@GetMapping("/getTeacherDetailsById/{id}")
	public TeacherModel getTeacherDetailsById(@PathVariable long id) {
		return teacherService.findTeacherDetailsById(id);
	}
	
	@PutMapping("/updateTeacherDetails")
	public void updateTeacherDetails(TeacherModel tm) {
		teacherService.updateTeacherDetails(tm);
	}

}
