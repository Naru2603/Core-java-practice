package com.oops.inheritance.association;

public class StudentId {

	int rollNo;
	long mobNo;
	
	public StudentId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentId(int rollNo, long mobNo) {
		super();
		this.rollNo = rollNo;
		this.mobNo = mobNo;
	}

	@Override
	public String toString() {
		return "StudentId [rollNo=" + rollNo + ", mobNo=" + mobNo + "]";
	}
	
	
}
