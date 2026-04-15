package practice7_01.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Vehicle());
		
		driver.drive(new Bus());
		
		
		Vehicle texi = new Texi();
		driver.drive(texi);

	}

}
