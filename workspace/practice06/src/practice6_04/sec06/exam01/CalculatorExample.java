package practice6_04.sec06.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.powerOn();
		int result = cal.plus(10, 20);
		double result2 = cal.divide(200, result);
		
		System.out.println(result);
		System.out.println(result2);
		
		cal.powerOff();

	}

}
