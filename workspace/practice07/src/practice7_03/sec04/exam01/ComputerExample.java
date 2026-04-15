package practice7_03.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		int r =10;
		
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.areaCircle(r));
		Computer computer = new Computer();
		System.out.println(computer.areaCircle(r));
		computer.method();
		Calculator computer2 = new Computer();
		System.out.println(computer2.areaCircle(r));
		

	}

}
