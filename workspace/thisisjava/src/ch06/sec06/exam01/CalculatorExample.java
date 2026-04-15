package ch06.sec06.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.powerOn();
		int val1 = calc.plus(3,4);
		
		System.out.println(val1);
		calc.powerOff();

	}

}
