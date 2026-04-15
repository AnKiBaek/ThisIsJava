package practice6_02.sec08.exam02;

public class Computer {
	
	// 가변인자 메서드 sum 선언
	int sum(int...values) {
		int sum= 0;
		for(int i = 0; i < values.length; i++) {
			sum +=values[i];
		}
		return sum;
	}

}
