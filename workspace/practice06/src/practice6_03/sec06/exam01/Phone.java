package practice6_03.sec06.exam01;

public class Phone {
	
	//필드선언
	String model;
	String company;
	int price;
	
	
	Phone(){
		
	}
	
	Phone(String model , int price){
		this(model,"SAMSUNG",price);
	}
	
	Phone(String model , String company , int price){
		this.model = model;
		this.company = company;
		this.price = price;
	}

}
