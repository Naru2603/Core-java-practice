package com.oops.inheritance.single;

public class TestStudent extends Student{

	private int rollNo;
	private String clgName;
	private String branch;
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	
	@Override
	public String toString() {
		return "TestStudent [rollNo=" + rollNo + ", clgName=" + clgName + ", branch=" + branch + "]";
	}

	public static void main(String[] args) {
		
		TestStudent t = new TestStudent();
		
		t.setName("Narendra Korade");
		System.out.println("Name is : "+t.getName());
		
		t.setCity("Hupari");
		System.out.println("City is : "+t.getCity());
		
		t.setRollNo(1234);
		System.err.println("Roll No is : "+t.getRollNo());
		
		t.setClgName("ADCET");
		System.out.println("College name is : "+t.getClgName());
		
		t.setBranch("Mechanical");
		System.out.println("Branch is : "+t.getBranch());
		
		System.out.println(t.toString());
	}

}
