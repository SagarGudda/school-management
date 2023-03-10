package com.school.management.result.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "roll_no")
	private long rollNumber;
	
	@Column(name = "subject_name")
	private String subjectName;
	
	private int score;
	
	@Column(name = "total_score")
	private int totalScore;
	
	@Column(name = "result")
	private int result;
	
}
