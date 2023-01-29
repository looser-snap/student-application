package com.sample.student.repository;

import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import com.sample.student.vo.StudentVO;

/**
 * The Default implementation for Student Repository contract
 * 
 * @author GG683DP
 *
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

	/** The studentVOs */
	private Set<StudentVO> studentVOs = ConcurrentHashMap.newKeySet();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudentVO addStudent(StudentVO studentVO) {

		studentVOs.add(studentVO);
		return studentVO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Optional<StudentVO> getStudent(Integer rollNo) {

		return studentVOs.stream().filter(studentVO -> studentVO.getRollNo().equals(rollNo)).findAny();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Set<StudentVO> getAllStudents() {

		return studentVOs;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void deleteStudent(Integer rollNo) {

		studentVOs.removeIf(studentVO -> studentVO.getRollNo().equals(rollNo));
	}

}
