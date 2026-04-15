package practice7_08.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver =new Driver();
		
		driver.drive(new Vehicle());
		
		driver.drive(new Car());
		
		driver.drive(new Bus());
		driver.drive(new Texi());
	}

}
