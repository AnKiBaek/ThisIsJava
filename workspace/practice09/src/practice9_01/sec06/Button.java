package practice9_01.sec06;

public class Button {

	//인터페이스 타입필드
	ClickListener clickListener;
	
	//버튼 리스너 세팅 메서드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	//클릭메서드
	public void click() {
		//인터페이스 메서드 실행
		clickListener.onClick();
	}
	
	//중첩 정적인터페이스
	public static interface ClickListener{
		// 추상메서드 생성
		public void onClick();
	}
}
