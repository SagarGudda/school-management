package com.school.management.classroutine;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.management.classroutine.dao.ClassRoutineDao;
import com.school.management.classroutine.model.ClassRoutine;

@RestController
public class ClassRoutineController {

	@Autowired
	ClassRoutineDao classRoutineDao;
	
	@Autowired
	AttendanceProxy attendanceProxy;
	
	@GetMapping("/getAllClassRoutine")
	public List<ClassRoutine> getAllClassRoutine(){
		return classRoutineDao.getAllClassRoutine();
	}
	
	@GetMapping("/getClassRoutineByDay/{day}")
	public ClassRoutine getClassRoutineByDay(@PathVariable String day) {
		return classRoutineDao.getClassRoutineByDay(day);
	}
	
	@PostMapping("/addClassRoutine")
	public ClassRoutine addClassRoutine(@RequestBody ClassRoutine classRoutine) {
		return classRoutineDao.addClassRoutine(classRoutine);
	}
	
	@GetMapping("/getAllAttendanceDetails")
	public List<AttendanceModel> getAllAttendanceDetails() {
		System.out.println("Entering into admin: getAllAttendanceDetails ");
		List<AttendanceModel> tml=attendanceProxy.getAllAttendance();
		System.out.println("Exiting into admin: getAllAttendanceDetails ");
		return tml;
	}
}
