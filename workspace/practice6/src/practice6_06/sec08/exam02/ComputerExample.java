package practice6_06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		Computer computer = new Computer();
		int result1 = computer.sum(20,20);
		int result2 = computer.sum(10,20,30,40);
		
		System.out.println(result1 + result2);

	}

}
