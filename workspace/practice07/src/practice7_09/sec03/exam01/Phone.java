package practice7_09.sec03.exam01;

public class Phone {
	
	private String model;
	private String color;
	
	Phone(){
		System.out.println("Phone 생성자실행");
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

}
