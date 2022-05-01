package org.student;

import org.college.College;
import org.department.Department;
public class Student extends Department {
	public void studentName() {
		System.out.println("Class Student - Method - studentName");
	}
	public void studentDept() {
		System.out.println("Class Student - Method - studentDept");
	}
	public void studentId() {
		System.out.println("Class Student - Method - studentId");

}
	public static void main(String[] args) {
		College Collegeobj = new College();
		Department Departmentobj = new Department();
		Student Studentobj = new Student();
		//calling the college clase
		Collegeobj.collegeCode();
		Collegeobj.collegeName();
		Collegeobj.collegeRank();
		System.out.println("------------------------");
		//calling the department 
		Departmentobj.deptName();
		Departmentobj.collegeCode();
		Departmentobj.collegeName();
		Departmentobj.collegeRank();
		System.out.println("------------------------");
		Studentobj.studentName();
		Studentobj.studentDept();
		Studentobj.studentId();
		Studentobj.deptName();
		Studentobj.collegeCode();
		Studentobj.collegeName();
		Studentobj.collegeRank();
		
	}
}
