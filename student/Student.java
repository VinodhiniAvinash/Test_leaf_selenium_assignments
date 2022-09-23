package org.student;

import org.department.Department;

public class Student extends Department{
	
	public static void studentName() {
		System.out.println("Student Name : Vinodhini");
	}
	
	public static void studentDept() {
		System.out.println("Student Department : ECE");
	}
	
	public static void studentId() {
		System.out.println("Student ID : 173");
	}
	
	public static void main(String args[])
	{
		Student report = new Student();
		
		//Call method from Student class
		report.studentName();
		report.studentDept();
		report.studentId();
		
		//Multilevel inheritance
		
		//Inherited from Department class
		report.deptName();
		
		//Inherited from College class
		report.collegeName();
		report.collegeCode();
		report.collegeRank();
	}

}
