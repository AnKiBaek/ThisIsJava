package practice5_9.sec10;

public class Ex {
	private double winnerLife(double traningTime) {
		double result = traningTime * 60;
		double winnerVision = result /100;
		return winnerVision;
	}
	private double workLevel(double tired) {
		double lucky =0.001;
		tired += lucky;
		return winnerLife(tired);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex ex =new Ex();
		System.out.println(ex.workLevel(100));

	}

}
