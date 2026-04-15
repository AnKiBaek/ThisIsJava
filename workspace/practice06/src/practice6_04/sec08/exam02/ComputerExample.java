package practice6_04.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		Computer computer = new Computer();
		int val1 = computer.sum(100,100);
		int val2 = computer.sum(20,5);
		
		double result =computer.divide(val1, val2);
		
		System.out.println(result);
		
		

	}

}
