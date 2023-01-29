package com.sample.student.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.student.exception.SystemException;
import com.sample.student.repository.StudentRepository;
import com.sample.student.vo.StudentVO;

/**
 * Implementation for Student Service Contract
 * 
 * @author AJOSE
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	/** The studentRepository */
	@Autowired
	private StudentRepository studentRepository;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudentVO addStudent(StudentVO studentVO) {

		return studentRepository.addStudent(studentVO);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudentVO getStudent(Integer rollNo) {

		Optional<StudentVO> studentVO = studentRepository.getStudent(rollNo);
		return studentVO.map(student -> student)
				.orElseThrow(() -> new SystemException(STUDENT_NOT_FOUND_CODE, STUDENT_NOT_FOUND_MESSAGE));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Set<StudentVO> getAllStudents() {

		return studentRepository.getAllStudents();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void deleteStudent(Integer rollNo) {

		studentRepository.deleteStudent(rollNo);
	}

}
