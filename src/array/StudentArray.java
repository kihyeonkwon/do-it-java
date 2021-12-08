package array;

public class StudentArray {

	public static void main(String[] args) {

		Student[] group = new Student[3];
		group[0] = new Student("Keith");
		group[1] = new Student("Jack");
		group[2] = new Student("Hans");

		for (int i = 0; i < 3; i++) {
			group[i].getInfo();
		}

	}

}
