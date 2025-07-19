package com.school.management.student.model;

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
@Data
@NoArgsConstructor
@Table(name = "student")
public class StudentModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	
	@Column(name = "class")
	private Long studentClass;
	
	@Column(name = "roll_no")
	private Long rollNumber;
	
	@Column(name = "date_of_birth")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dob;
	
	@Column(name = "birth_certificate_number")
	private Long birthCertificateNumber;
	
	@Column(name = "email_id")
	private String emailId;
	
	private String password;
	
	@Column(name = "rewrite_password")
	private String rewritePassword;
	
	@Column(name = "student_id")
	private Long studentId;
	
	@Column(name = "father_name")
	private String fatherName;
	
	@Column(name = "father_contact_no")
	private String fatherContactNo;
	
	@Column(name = "father_occupation")
	private String fatherOccupation;
	
	@Column(name = "mother_name")
	private String motherName;
	
	@Column(name = "mother_contact_no")
	private String motherContactNo;
	
	@Column(name = "mother_occupation")
	private String motherOccupation;

}
