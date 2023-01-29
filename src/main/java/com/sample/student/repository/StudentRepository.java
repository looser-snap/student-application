package com.sample.student.repository;

import java.util.Optional;
import java.util.Set;

import com.sample.student.vo.StudentVO;

/**
 * Contract for Student Repository
 * 
 * @author AJOSE
 *
 */
public interface StudentRepository {

	/**
	 * Method to add student to students list
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
	Optional<StudentVO> getStudent(Integer rollNo);

	/**
	 * Method to fetch all students
	 * 
	 * @return studentVOs
	 */
	Set<StudentVO> getAllStudents();

	/**
	 * Method to remove student from student list based on rollNo
	 * 
	 * @param rollNo
	 */
	void deleteStudent(Integer rollNo);

}
