package practice6_05.sec06.exam01;

public class Mouse {

	String model;
	String company;
	int price;
	
	Mouse(){
		
	}
	
    Mouse(String company , int price){
		this("익스3", company, price);
	}
    
    Mouse(String model, String company , int price){
    	this.model = model;
    	this.company = company;
    	this.price = price;
    }
	

}
