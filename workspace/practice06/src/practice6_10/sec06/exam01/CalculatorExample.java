package practice6_10.sec06.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.powerOn();
		int result = cal.plus(10,100);
		double result2 = cal.divide(1000, result);
		System.out.println(result);
		System.out.println(result2);
		cal.powerOff();

	}

}
