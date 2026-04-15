package practice6_01.sec06.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.powerOn();
		
	   
		System.out.println(cal.plus(10, 20));
		
		double result = cal.divide(200, 2);
		
		System.out.println(result);
		
		
		cal.powerOff();

	}

}
