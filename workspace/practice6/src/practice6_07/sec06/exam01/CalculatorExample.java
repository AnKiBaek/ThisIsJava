package practice6_07.sec06.exam01;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		cal.powerOn();
		System.out.println(cal.plus(10, 10));
		double result = cal.divide(200,20);
		System.out.println(result);
		cal.powerOff();
		
	}

}
