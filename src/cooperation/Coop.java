package cooperation;

public class Coop {
	public static void main(String[] args) {
		Student studentA = new Student("A", 5000);
		Student studentB = new Student("B", 3000);

		Bus bus101 = new Bus(101);
		Subway subwayL2 = new Subway(2);

		studentA.takeBus(bus101);
		studentA.takeSubway(subwayL2);

		studentB.takeSubway(subwayL2);

		studentA.showInfo();
		studentB.showInfo();
		bus101.showInfo();
		subwayL2.showInfo();

	}

}
