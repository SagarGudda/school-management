package com.school.management.teacher.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TeacherModel {
	
	private long id;
	private String name;
	private long registrationNumber;
	private String emailId;
	private String password;
	private String rewritePassword;
	private String address;
	private String contactNumber;
	private Date dob;
	private Date dateOfJoining;

}
