package com.school.management.attendance.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
public class Attendance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "curdate")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateOfAttendance;
	
	@Column(name = "roll_no")
	private long rollNumber;
	
	@Column(name = "name")
	private String studentName;
	
	private String day;
}
