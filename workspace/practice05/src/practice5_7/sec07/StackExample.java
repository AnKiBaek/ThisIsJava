package practice5_7.sec07;

public class StackExample {
	
    private int intMethod(int x) {
    	System.out.println(x+x);
    	
    	return x+x;
    }
    
    private int returnMethod(int a) {
    	
    	int v = 10;
    	
    	return intMethod(v*a); 
    }
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackExample  esx  = new StackExample();
		
		System.out.println(esx.returnMethod(34));
		

		
	}

}
