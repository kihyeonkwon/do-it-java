package object_oriented_programming;

public class Person {
	String name;
	int height;
	double weight;
	char gender;
	boolean married;
	
	public Person(String name, int height, char gender, boolean married) {
		this.name = name;
		this.height = height;
		this.gender = gender;
		this.married = married;
	}
	
	public String getPersonName() {
		return name;
	}

}
