package com.seat;

public class Student {

	private Integer studentId = null;
	private String name = null;
	private Integer rankOfStudent = null;
	private Integer allocatedSeatNumber = null;
	private Integer choiceNumber = null;
	private boolean seatAllocated = false;

	// zero param constructor
	public Student() {
	
	}

	// using param constructor
	public Student(Integer studentId, String name, Integer rankOfStudent, Integer allocatedSeatNumber,
			Integer choiceNumber, boolean seatAllocated) {
		this.studentId = studentId;
		this.name = name;
		this.rankOfStudent = rankOfStudent;
		this.allocatedSeatNumber = allocatedSeatNumber;
		this.choiceNumber = choiceNumber;
		this.seatAllocated = seatAllocated;
	}


	// getter and setter
	
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRankOfStudent() {
		return rankOfStudent;
	}

	public void setRankOfStudent(Integer rankOfStudent) {
		this.rankOfStudent = rankOfStudent;
	}

	public Integer getAllocatedSeatNumber() {
		return allocatedSeatNumber;
	}

	public void setAllocatedSeatNumber(Integer allocatedSeatNumber) {
		this.allocatedSeatNumber = allocatedSeatNumber;
	}

	public Integer getChoiceNumber() {
		return choiceNumber;
	}

	public void setChoiceNumber(Integer choiceNumber) {
		this.choiceNumber = choiceNumber;
	}

	public boolean isSeatAllocated() {
		return seatAllocated;
	}

	public void setSeatAllocated(boolean seatAllocated) {
		this.seatAllocated = seatAllocated;
	}
	
	
	

}
