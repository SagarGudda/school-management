package com.school.management.attendance.dao;

import java.util.List;

import com.school.management.attendance.model.Attendance;

public interface AttendanceDao {
	
	public Attendance addAttendance(Attendance attendance);
	public List<Attendance> getAttendanceDetails();
	public Attendance getAttendanceByRollNumber(long rollNumber);

}
