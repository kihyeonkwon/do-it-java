package interfaceex;

public interface Calc {
	// 인터페이스의 변수는 컴파일 과정에서 상수로 변경(public static final)
	double PI = 3.14;
	int ERROR = -99999999;

	// 인터페이스이 메소드는 컴파일 과정에서 추상 메서드로 변환(public abstract)
	int add(int num1, int num2);

	int subtract(int num1, int num2);

	int multiply(int num1, int num2);

	int divide(int num1, int num2);

}
