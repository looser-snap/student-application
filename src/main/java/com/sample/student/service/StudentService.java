package com.sample.student.service;

import java.util.Set;

import com.sample.student.vo.StudentVO;

/**
 * Contract for Student Service
 * 
 * @author AJOSE
 *
 */
public interface StudentService {

	/** {@value #STUDENT_NOT_FOUND_CODE} */
	String STUDENT_NOT_FOUND_CODE = "STUDENT_NOT_FOUND_CODE";

	/** {@value #STUDENT_NOT_FOUND_MESSAGE} */
	String STUDENT_NOT_FOUND_MESSAGE = "The student not exist with given rollNo";

	/**
	 * Method to add a new student
	 * 
	 * @param studentVO
	 * @return studentVO
	 */
	StudentVO addStudent(StudentVO studentVO);

	/**
	 * Method to fetch a student by rollNo
	 * 
	 * @param rollNo
	 * @return students
	 */
	StudentVO getStudent(Integer rollNo);

	/**
	 * Method to fetch all students
	 * 
	 * @return studentVOs
	 */
	Set<StudentVO> getAllStudents();

	/**
	 * Method to remove a student
	 * 
	 * @param rollNo
	 */
	void deleteStudent(Integer rollNo);

}
