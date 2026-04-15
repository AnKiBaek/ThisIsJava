package practice6_03.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		Computer computer = new Computer();
		
		String strArr1 = computer.str("1","하핳하ㅏㅎ하하하하핳하하ㅏ");
		String strArr2 = computer.str("1","하핳하ㅏㅎ하하하하핳하하ㅏ","또있지롱");
		
		System.out.println(strArr1);
		System.out.println(strArr2);
		
	}

}
