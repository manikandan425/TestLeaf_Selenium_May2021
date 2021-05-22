package week3.day1.assignments.student;

import week3.day1.assignments.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student Name is Mani");
	}
	public void studentDept() {
		System.out.println("Student Department is Selenium Training");
	}
	public void studentId() {
		System.out.println("Student I is 792822");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.collegeName();
		student.collegeRank();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();

	}

}
