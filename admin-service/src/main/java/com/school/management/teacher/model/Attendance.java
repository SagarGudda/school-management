package com.school.management.teacher.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Attendance {

	private long id;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateOfAttendance;
	
	private long rollNumber;
	
	private String studentName;
	
	private String day;
}
