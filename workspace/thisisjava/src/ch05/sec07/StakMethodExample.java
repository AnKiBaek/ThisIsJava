package ch05.sec07;

public class StakMethodExample {
	
    
	
	 int foo(int b){
    	int a= 5;
    	return a*b + 10;
    }
	
	 int bar(int x) {
		int y =3;
		return foo(x*y);
	}
	
	public static void main(String[] args) {
		
		StakMethodExample skm = new StakMethodExample();
		System.out.println(skm.bar(6));

	}

}
