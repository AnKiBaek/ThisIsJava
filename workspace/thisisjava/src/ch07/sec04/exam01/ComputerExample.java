package ch07.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 100;
		
		Calculator cal1 = new Calculator();
		System.out.println("원 면적: "+ cal1.areaCircle(r));
		System.out.println();
		Computer computer = new Computer();
		System.out.println(computer.areaCircle(r));
		

	}

}
