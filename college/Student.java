package org.college;

public class Student extends Department{
	public void studentName() {	
		System.out.println("StudentName");
	}
	public void studentDept() {	
		System.out.println("StudentDepartment");
	}
	public void studentId() {
		System.out.println("StudentId");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentId();
		s.studentDept();
	}
}
