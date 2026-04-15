package ch11.sec03.exam01;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
	
		//main

		String[] array = {"200","숫자아님",null,"10000"};

		
		    for( int i = 0 ; i <=array.length ; i ++){
		    
		   try{
			System.out.println("array["+ i +"]의 길이: "+array[i].length());
			int val = Integer.parseInt(array[i]);
		    System.out.println(val);
		    
		  } catch (NumberFormatException e) {
		    System.out.println("숫자로 변환할수없는 항목이있습니다.");
			e.printStackTrace();
		  }catch (ArrayIndexOutOfBoundsException| NullPointerException e) {
		    System.out.println("배열의 범위를 벗어났거나, Null을 참조하고 있습니다.");
			e.printStackTrace();
		  }catch (Exception e) {
		   System.out.println("예상치 못한 예외가 발생했습니다.");
			e.printStackTrace();
		  } 
	  }
	}
}
