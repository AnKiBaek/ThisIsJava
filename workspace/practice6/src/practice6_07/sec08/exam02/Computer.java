package practice6_07.sec08.exam02;

public class Computer {
	int minus(int...values) {
		int sum = 10000;
		for(int i : values) {
			sum -= i;
		}
		return sum;
	}

}
