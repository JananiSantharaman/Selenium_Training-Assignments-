package org.student;

public class Students {
	public void getStudentInfo(int ID) {
		System.out.println("ID-"+ ID);
	}
	public void getStudentInfo(int ID,String name) {
		System.out.println("ID-"+ ID +"- Student name - "+name);
	}
	public void getStudentInfo(int ID,String name,String Emailid) {
		System.out.println("ID-"+ ID +"- Student name - "+name+"- Student Email - "+Emailid);
	}
	public void getStudentInfo(int ID,String name,String Emailid,int phonenumer) {
		System.out.println("ID-"+ ID +"- Student name - "+name+"- Student Email - "+Emailid+"- Student Email - "+phonenumer);
	}	
public static void main(String[] args)
{
	Students Studentinfo = new Students();
	Studentinfo.getStudentInfo(1234);
	Studentinfo.getStudentInfo(1234, "Janani");
	Studentinfo.getStudentInfo(1234, "Janani", "Jananisantharaman@jj.com");
	Studentinfo.getStudentInfo(1234, "Janani", "Jananisantharaman@ii.com",12345670);
}
}
