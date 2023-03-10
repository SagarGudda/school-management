package com.school.management.classroutine;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "attendance.service")
public interface AttendanceProxy {

	@PostMapping("/addAttendance")
	public AttendanceModel addAttendance(@RequestBody AttendanceModel attendance);
	
	@GetMapping("/getAllAttendance")
	public List<AttendanceModel> getAllAttendance();
}
