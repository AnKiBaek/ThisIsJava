package practice7_04.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Vehicle());
		Vehicle bus = new Bus();
		
		driver.drive(bus);
		
		Texi texi = new Texi();
		
		driver.drive(texi);
	} 
}
