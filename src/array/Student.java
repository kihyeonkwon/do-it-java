package array;

public class Student {
	static int studentNO = 0;
	int studentID;
	String studentName;

	public Student() {
	};

	public Student(String studentName) {
		studentNO++;
		this.studentID = studentNO;
		this.studentName = studentName;
	}

	public void getInfo() {
		System.out.println("학생번호" + studentID + "이름" + studentName);
	}
}
