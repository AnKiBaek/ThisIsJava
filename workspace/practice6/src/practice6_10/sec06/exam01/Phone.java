package practice6_10.sec06.exam01;

public class Phone {
	
	String model;
	double sale;
	int price;
	
	Phone(){
		
	}
	
	Phone(double sale, int price){
		this("삼성",sale,price);
	}
	
	Phone(String model, double sale, int price){
		this.model = model;
		this.sale = sale;
		this.price = price;
	}

}
