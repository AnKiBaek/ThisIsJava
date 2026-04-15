package practice6_09.sec08.exam03;

public class CellphoneExample {

	public static void main(String[] args) {
		Cellphone cellphone = new Cellphone();
		
		//배터리 지정
		cellphone.setBt(20);
		//배터리가있는지 체크후 참거짓 반환후 btLow메서드 실행
		if(cellphone.power()) {
			System.out.println("켬");
			cellphone.btLow();
		//else 를 이용하면 종료 출력 안됨
		//btLow 에서 return 을만나면 main 에서는 else 에 갈기회가 없기때문에 따로 지정해줘야한다.
		} /*else {
			System.out.println("종료");
		}*/
		System.out.println("종료");
		
		
		

	}

}
