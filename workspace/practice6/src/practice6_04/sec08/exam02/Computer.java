package practice6_04.sec08.exam02;

public class Computer {
	
	//가변인자 메서드 선언
	int sum(int...values) {
		int sum = 0;
		for(int i = 0; i< values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// divide 메서드
	double divide(int x , int y){
		double result = 0;
		
		result = (double)x / (double)y;
		
		return result;
	}

}
