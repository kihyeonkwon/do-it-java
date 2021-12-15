package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		// OOP
		String s1 = "hello";
		String s2 = "world";
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);

		// FP
		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);

	}

}
