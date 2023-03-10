package com.school.management.teacher.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@Table(name = "teacher")
public class TeacherModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	@Column(name = "registration_number")
	private long registrationNumber;
	@Column(name = "email_id")
	private String emailId;
	private String password;
	@Column(name = "rewrite_password")
	private String rewritePassword;
	private String address;
	@Column(name = "contact_no")
	private String contactNumber;
	@Column(name = "date_of_birth")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dob;
	@Column(name = "date_of_joining")
	private Date dateOfJoining;

}
