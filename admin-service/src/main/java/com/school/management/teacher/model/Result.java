package com.school.management.teacher.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Result {

	private long id;
	
	private long rollNumber;
	
	private String subjectName;
	
	private int score;
	
	private int totalScore;
	
	private int result;
	
}
