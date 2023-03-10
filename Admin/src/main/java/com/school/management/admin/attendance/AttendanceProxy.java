package com.school.management.admin.attendance;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.school.management.teacher.model.Attendance;


@FeignClient(name = "attendance.service")
public interface AttendanceProxy {

	@PostMapping("/addAttendance")
	public Attendance addAttendance(@RequestBody Attendance attendance);
	
	@GetMapping("/getAllAttendance")
	public List<Attendance> getAllAttendance();
}
