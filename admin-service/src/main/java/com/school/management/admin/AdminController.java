package com.school.management.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.school.management.admin.attendance.AttendanceProxy;
import com.school.management.admin.classroutine.ClassRoutineProxy;
import com.school.management.admin.result.ResultProxy;
import com.school.management.admin.student.StudentServiceProxy;
import com.school.management.admin.teacher.TeacherServiceProxy;
import com.school.management.teacher.model.Attendance;
import com.school.management.teacher.model.ClassRoutine;
import com.school.management.teacher.model.Result;
import com.school.management.teacher.model.StudentModel;
import com.school.management.teacher.model.TeacherModel;

@Controller
public class AdminController {
	
	@Autowired
	TeacherServiceProxy teacherServiceProxy;
	@Autowired
	StudentServiceProxy studentServiceProxy;
	@Autowired
	AttendanceProxy attendanceProxy;
	@Autowired
	ResultProxy resultProxy;
	@Autowired
	ClassRoutineProxy classRoutineProxy;
	

	@GetMapping("/school-management")
	public ModelAndView showDashboard() {
		ModelAndView modelAndView = new ModelAndView("dashboard");
		List<TeacherModel> teachers=getAllTeacherDetails();
		modelAndView.addObject("teachers", teachers);
		
		List<StudentModel> students=getAllStudentDetails();
		modelAndView.addObject("students", students);
		
		List<Attendance> attendances=getAllAttendanceDetails();
		modelAndView.addObject("attendances", attendances);
		
		List<ClassRoutine> classRoutines=getAllClassRoutineDetails();
		modelAndView.addObject("classRoutines", classRoutines);
		
		/*
		 * List<Result> results=getAllStudentResultDetails();
		 * modelAndView.addObject("results", results);
		 */
		
		return modelAndView;
	}
	
	@GetMapping("/registerTeacher")
	public ModelAndView registerTeacher() {
		System.out.println("Entering into admin:registerTeacher ");
		ModelAndView modelAndView = new ModelAndView("showTeacher");
		modelAndView.addObject("teacherModel", new TeacherModel());
		return modelAndView;
	}
	
	
	@PostMapping("/processTeacherRegister")
	public ModelAndView processTeacherRegister(@ModelAttribute("teacherModel") TeacherModel teacherModel) {
		System.out.println("Entering into admin:processTeacherRegister method");
		
		ModelAndView modelAndView = new ModelAndView("showTeacher");
		modelAndView.addObject("teacherModel", new TeacherModel());
		
		
		teacherServiceProxy.createTeacher(teacherModel);
		
		System.out.println("Exiting admin:processTeacherRegister method");
		return modelAndView;
		
	}
	
	@GetMapping("/getAllTeacherDetails")
	public List<TeacherModel> getAllTeacherDetails() {
		System.out.println("Entering into admin:getAllTeacherDetails ");
		System.out.println(" Pass token to the getAllTeacherDetails of TeacherService application");
		List<TeacherModel> tml=teacherServiceProxy.getAllTeacherDetails();
		System.out.println("Exiting into admin:getAllTeacherDetails ");
		return tml;
	}
	
	@GetMapping("/getAllClassRoutineDetails")
	public List<ClassRoutine> getAllClassRoutineDetails() {
		System.out.println("Entering into admin: getAllClassRoutineDetails ");
		List<ClassRoutine> tml=classRoutineProxy.getAllClassRoutine();
		System.out.println("Exiting into admin: getAllClassRoutineDetails ");
		return tml;
	}
	
	@GetMapping("/getAllAttendanceDetails")
	public List<Attendance> getAllAttendanceDetails() {
		System.out.println("Entering into admin: getAllAttendanceDetails ");
		List<Attendance> tml=attendanceProxy.getAllAttendance();
		System.out.println("Exiting into admin: getAllAttendanceDetails ");
		return tml;
	}
	
	@GetMapping("/getAllStudentResultDetails")
	public List<Result> getAllStudentResultDetails() {
		System.out.println("Entering into admin: getAllStudentResultDetails ");
		List<Result> tml=resultProxy.getAllStudentResults();
		System.out.println("Exiting into admin: getAllStudentResultDetails ");
		return tml;
	}
	
	@GetMapping("/getAllStudentDetails")
	public List<StudentModel> getAllStudentDetails() {
		System.out.println("Entering into admin: getAllStudentDetails ");
		List<StudentModel> tml=studentServiceProxy.getAllStudentDetails();
		System.out.println("Exiting into admin: getAllStudentDetails ");
		return tml;
	}

	@GetMapping("/")
	public ModelAndView loadPage() {
		System.out.println("Entering into admin:registerTeacher ");
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}

	@GetMapping("/login")
	public ModelAndView login() {
		System.out.println("Entering into admin:Login ");
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
}
