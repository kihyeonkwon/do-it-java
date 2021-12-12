package scheduler;

public class PriorityAllocation implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다.(priority)");
		// TODO Auto-generated method stub

	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("업무 스킬이 높은 상담원에게 우선 배분합니다.(priority)");

	}

}
