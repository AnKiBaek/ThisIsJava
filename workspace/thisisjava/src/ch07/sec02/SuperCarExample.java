package ch07.sec02;

public class SuperCarExample extends Car{
	
	void changeModeSports() {
		System.out.println("스포츠모드로 변경합니다");
	}
	void changeModeNomal() {
		System.out.println("노멀모드로 변경합니다");
	}

	public static void main(String[] args) {
		
		SuperCarExample  superCar = new SuperCarExample();
		
		superCar.setColor("빨간색");
		superCar.setModel("BongGorgini");
		
		
		System.out.println(superCar.getModel());
		System.out.println(superCar.getColor());
		System.out.println(superCar.toString());
		
		superCar.driveOn();
		
		superCar.changeModeSports();
		superCar.changeModeNomal();
		
		

	}

}
