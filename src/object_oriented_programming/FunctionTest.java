package object_oriented_programming;


public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println("값은 " + sum + "입니다");
		
	}

	
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
}
