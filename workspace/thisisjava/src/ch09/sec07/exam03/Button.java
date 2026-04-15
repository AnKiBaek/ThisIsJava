package ch09.sec07.exam03;

public class Button {
	
	//필드
	private ClickListener clickListener;
	//생성자
	//메서드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		clickListener.onClick();
	}
	//중첩클래스
	//중첩인터페이스
	public static interface ClickListener{
		public void onClick();
	}

}
