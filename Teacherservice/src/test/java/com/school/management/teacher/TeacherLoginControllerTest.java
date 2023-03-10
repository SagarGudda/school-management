package com.school.management.teacher;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.school.management.teacher.model.TeacherModel;
import com.school.management.teacher.service.TeacherService;

@ExtendWith(MockitoExtension.class)
public class TeacherLoginControllerTest {
	
	@InjectMocks
	TeacherLoginController teacherLoginController;
	
	@Mock
	TeacherService teacherService;
	
	@BeforeEach
	public void setup() {
		when(teacherService.findAllTeacherDetails()).thenReturn(getListOfTeachers());
	}
	
	private List<TeacherModel> getListOfTeachers(){
		List<TeacherModel> tml=new ArrayList<TeacherModel>();
		TeacherModel tmodel=new TeacherModel();
		tmodel.setId(1);
		tmodel.setName("sagar");
		tml.add(tmodel);
		return tml;
	}

	@Test
	public void testLogin() {
		
		//find all teacher details
		
		List<TeacherModel> tm= teacherLoginController.getAllTeacherDetails();
		assertEquals(1, tm.get(0).getId());
		
	}

}
