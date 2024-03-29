package com.school.management.classroutine.model;

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
public class ClassRoutine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String day;
	private String classTime;
	
}
