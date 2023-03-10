package com.school.management.attendance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.management.attendance.dao.AttendanceDao;
import com.school.management.attendance.model.Attendance;

@Controller
public class AttendanceController {
	
	@Autowired
	AttendanceDao attendanceDao;

	@PostMapping("/addAttendance")
	public Attendance addAttendance(@RequestBody Attendance attendance) {
		return attendanceDao.addAttendance(attendance);
	}
	
	@GetMapping("/getAllAttendance")
	public List<Attendance> getAllAttendance() {
		return attendanceDao.getAttendanceDetails();
	}
	
	@GetMapping("getAttendanceByRollNumber/{rollNumber}")
	public Attendance getAttendanceByRollNumber(@PathVariable long rollNumber) {
		return attendanceDao.getAttendanceByRollNumber(rollNumber);
	}
}
