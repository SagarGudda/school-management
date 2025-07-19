package com.school.management.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.school.management.student.service.StudentService;
import com.school.management.student.model.StudentModel;

@RestController
public class StudentLoginController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/login")
	public ModelAndView login() {
		StudentModel tl=new StudentModel();
		return new ModelAndView("login");
	}
	
	@PostMapping("/saveStudentDetails")
	public void createStudent(@RequestBody StudentModel tm) {
		studentService.saveStudentDetails(tm);
	}
	
	@GetMapping("/getAllStudentDetails")
	public List<StudentModel> getAllStudentDetails() {
		return studentService.findAllStudentDetails();
	}
	
	@GetMapping("/getStudentDetailsById/{id}")
	public StudentModel getStudentDetailsById(@PathVariable long id) {
		return studentService.findStudentDetailsById(id);
	}
	
	@PutMapping("/updateStudentDetails")
	public void updateStudentDetails(@RequestBody StudentModel tm) {
		studentService.updateStudentDetails(tm);
	}

}
