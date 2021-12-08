package cooperation;

public class Subway {
	public static int fee = 2000;
	int lineNumber;
	int passengerCount = 0;
	int money = 0;

	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take() {
		this.money += Subway.fee;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(lineNumber + "번 라인의 지하철의 승객 수는" + passengerCount + "이며 수입은 " + money + "입니다.");
	}
}
