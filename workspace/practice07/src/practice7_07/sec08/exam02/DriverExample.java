package practice7_07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Vehicle());
		
		Vehicle texi = new Texi();
		
		driver.drive(texi);
		
		Bus bus = new Bus();
		
		driver.drive(bus);

	}

}
