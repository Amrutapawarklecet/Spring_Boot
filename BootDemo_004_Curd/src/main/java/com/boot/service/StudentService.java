package com.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.StudentDao;
import com.boot.entity.Student;




@Service
public class StudentService {
 
	@Autowired
	private StudentDao studentDao;
	
	public Student createStudent(Student student) {
		
		return studentDao.save(student);
		
	}
	
	//get all student
	
	public List<Student> getAllStudents(){
		return (List) studentDao.findAll();
	}
	
	public Student getStudentById(Integer studentId) {
		Optional<Student> optionalEntity=studentDao.findById(studentId);
		Student student=optionalEntity.get();
		return student;
		
	}

	public void deleteStudentById(Integer studentId) {
		studentDao.deleteById(studentId);
		
	}

	public Student updateStudentById(Student student) {
		
		return studentDao.save(student);
	}

	
}
