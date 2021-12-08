package cooperation;

public class Student {
	public String studentName;
	public int grade;
	public int money;

	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		this.money -= Bus.fee;
		bus.take();
	}

	public void takeSubway(Subway subway) {
		this.money -= Subway.fee;
		subway.take();
	}

	public void showInfo() {
		System.out.println(studentName + "의 남은 돈은" + money + "입니다.");
	}

}
