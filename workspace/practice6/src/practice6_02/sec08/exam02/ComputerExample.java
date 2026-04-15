package practice6_02.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		
		// 컴퓨터 객체생성
		Computer computer = new Computer();
		
		int result1 = computer.sum(10,10,10);
		int result2 = computer.sum(1,
				result1,
				result1,result1,result1,
				result1,result1,result1,
				result1,result1,result1,
				result1,result1,result1,
				result1,result1,result1,
				result1,result1,result1);
		
		System.out.println(result1);
		System.out.println(result2);

	}

}
