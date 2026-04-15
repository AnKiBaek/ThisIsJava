package practice5_10.sec05;

public class ReturnExam {
	
	private void hashCodeCreater(int x) {
		
		System.out.println(System.identityHashCode(x));
	
	}

	public static void main(String[] args) {
		
		ReturnExam re = new ReturnExam();
		re.hashCodeCreater(1231);

	}

}
