package com.school.management.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.management.attendance.model.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long>{
	
	Attendance findByRollNumber(long rollNumber);

}
