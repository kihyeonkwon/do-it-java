package scheduler;

public class LeastJob implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 가져옵니다.(least job)");
		// TODO Auto-generated method stub

	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("다음 순서 상담원에게 배분합니다.(least job)");

	}

}
