package practice7_01.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int r = 100;
		
		System.out.println(calculator.areaCircle(r));
		
		Computer computer = new  Computer();
		
		System.out.println(computer.areaCircle(r));
		

	}

}
