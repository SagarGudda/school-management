package com.school.management.attendance.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.management.attendance.dao.AttendanceDao;
import com.school.management.attendance.model.Attendance;
import com.school.management.attendance.repository.AttendanceRepository;

@Repository
public class AttendanceDaoImpl implements AttendanceDao {
	
	@Autowired
	AttendanceRepository attendanceRepository;

	@Override
	public Attendance addAttendance(Attendance attendance) {
		return attendanceRepository.save(attendance);
	}

	@Override
	public List<Attendance> getAttendanceDetails() {
		return attendanceRepository.findAll();
	}

	@Override
	public Attendance getAttendanceByRollNumber(long rollNumber) {
		return attendanceRepository.findByRollNumber(rollNumber);
	}

}
