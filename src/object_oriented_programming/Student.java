package object_oriented_programming;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
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
