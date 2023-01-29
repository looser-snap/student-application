package com.sample.student.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.student.service.StudentService;
import com.sample.student.vo.StudentVO;

/**
 * Rest Controller for Student CRUD operations
 * 
 * @author AJOSE
 *
 */
@RestController
public class StudentController {

	/** The studentService */
	@Autowired
	private StudentService studentService;

	/**
	 * Rest API to add a new student
	 * 
	 * @param studentVO
	 * @return studentVO
	 */
	@PostMapping(value = "/student", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentVO> addStudent(@RequestBody StudentVO studentVO) {

		studentVO = studentService.addStudent(studentVO);
		return new ResponseEntity<StudentVO>(studentVO, HttpStatus.OK);
	}

	/**
	 * Rest API to fetch a student by rollNo
	 * 
	 * @param rollNo
	 * @return studentVO
	 */
	@GetMapping(value = "/student/{rollNo}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentVO> getStudent(@PathVariable(name = "rollNo", required = true) Integer rollNo) {

		StudentVO studentVO = studentService.getStudent(rollNo);
		return new ResponseEntity<StudentVO>(studentVO, HttpStatus.OK);
	}

	/**
	 * Rest API to fetch all students
	 * 
	 * @return studentVOs
	 */
	@GetMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Set<StudentVO>> getAllStudents() {

		Set<StudentVO> studentVOs = studentService.getAllStudents();
		return new ResponseEntity<Set<StudentVO>>(studentVOs, HttpStatus.OK);
	}

	/**
	 * Rest API for remove a student with specific rollNo
	 * 
	 * @param rollNo
	 * @return message
	 */
	@DeleteMapping(value = "/student/{rollNo}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteStudent(@PathVariable(name = "rollNo", required = true) Integer rollNo) {

		studentService.deleteStudent(rollNo);
		return new ResponseEntity<String>("student deleted", HttpStatus.OK);
	}

}