package practice6_03.sec08.exam02;

public class Computer {
	
	//가변인자 메서드 선언
	String str(String...strArr) {
		
		String s = "";
		for(int i = 0 ; i < strArr.length; i++) {
			s += strArr[i];
		}
		return s;
	}

}
