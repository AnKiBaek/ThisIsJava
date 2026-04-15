package practice7_04.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 100;
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.areaCircle(r));
		
		Computer computer =new Computer();
		System.out.println(computer.areaCircle(r));
		
		

	}

}
