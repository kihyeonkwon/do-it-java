package object_oriented_programming;

public class StudentTest {

	public static void main(String[] args) {
		Student studentKwon = new Student();
		studentKwon.setStudentName("권기현");	
		System.out.println(studentKwon.getStudentName());
		
		Student studentLim = new Student();
		studentLim.setStudentName("임경호");
		
		
		System.out.println(studentKwon);
		System.out.println(studentLim);
		
		
	}

}
