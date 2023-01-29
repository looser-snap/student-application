package com.sample.student.vo;

import java.util.Objects;

/**
 * The Student VO Model
 * 
 * @author AJOSE
 *
 */
public class StudentVO {

	/** the rollNo */
	private Integer rollNo;

	/** the name */
	private String name;

	/** the place */
	private String place;

	/** the division */
	private Integer division;

	/**
	 * @return
	 */
	public Integer getRollNo() {
		return rollNo;
	}

	/**
	 * @param rollNo
	 */
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * @param place
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * @return
	 */
	public Integer getDivision() {
		return division;
	}

	/**
	 * @param division
	 */
	public void setDivision(Integer division) {
		this.division = division;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentVO other = (StudentVO) obj;
		return Objects.equals(rollNo, other.rollNo);
	}

}
