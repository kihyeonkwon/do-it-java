package cooperation;

public class Bus {
	public static int fee = 1000;
	int busNumber;
	int passengerCount = 0;
	int money = 0;

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public void take() {
		this.money += Bus.fee;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(busNumber + "번 버스의 승객 수는" + passengerCount + "이며 수입은 " + money + "입니다.");
	}

}
