package com.school.management.teacher.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentModel {
	
	private Long id;
	
	private String name;
	
	
	private Long studentClass;
	
	private Long rollNumber;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dob;
	
	private Long birthCertificateNumber;
	
	private String emailId;
	
	private String password;
	
	private String rewritePassword;
	
	private Long studentId;
	
	private String fatherName;
	
	private String fatherContactNo;
	
	private String fatherOccupation;
	
	private String motherName;
	
	private String motherContactNo;
	
	private String motherOccupation;

}
