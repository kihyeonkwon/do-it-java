package singleton;

public class Company {
	// 클래스 내부에 유일한 인스턴스 생성
	private static Company instance = new Company();

	// 외부에서 참조 가능한 메서드
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}

	// 외부에서 인스턴스를 만들지 못하게 만든다.
	// 싱글톤 디자인 패턴에서는 스태틱 속성들로 이루어진 단 하나의 객체만 쓰기 때문.
	private Company() {
	}

}
