package object_oriented_programming;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	Subject math;
	Subject english;
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Subject getMath() {
		return math;
	}

	public void setMath(Subject math) {
		this.math = math;
	}

	public Subject getEnglish() {
		return english;
	}

	public void setEnglish(Subject english) {
		this.english = english;
	}

	public void showStudentInfo() {
		System.out.println(studentName +"," + address);
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public String getStudentName() {
		return studentName;
	}
	

}
