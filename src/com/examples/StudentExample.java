package com.examples;

public class StudentExample {
	private String name;
	private String studentID;
	private String email;
	private String phoneNumber;
	private static String schoolName = "Delhi Public School ";
	
	public StudentExample() {
		
	}
	public StudentExample(String name,String studentID,String email,String phoneNumber) {
		this.name = name;
		this.studentID = studentID;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public static String getSchoolName() {
		return schoolName;
	}
	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
		
	}
	public void displayStudentInfo() {
		System.out.println("Student Name: " + name);
		System.out.println("Student ID: "  + studentID);
		System.out.println("Student Email: " + email);
		System.out.println("Student Phone Number: " + phoneNumber );
		System.out.println("School Name: " + getSchoolName() );
		
	}
	
	
	 

}
