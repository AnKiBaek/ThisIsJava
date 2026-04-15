package practice6_06.sec08.exam02;

public class Computer {
	
	int sum(int...val) {
		int sum = 0;
		for(int i = 0; i < val.length ; i++) {
			sum += val[i];
		}
		return sum;
	}

}
