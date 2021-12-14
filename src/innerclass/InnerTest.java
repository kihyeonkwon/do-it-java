package innerclass;

class OutClass {
	private int num = 10;
	private static int sNum = 20;

	class InClass {
		int inNum = 100;

		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클랫의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
		}
	}

	public void usingClass() {
		inClass.inTest();
	}

	private InClass inClass;

	public OutClass() {
		inClass = new InClass();
	}

}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래수 기능 호출");
		outClass.usingClass();
	}
}