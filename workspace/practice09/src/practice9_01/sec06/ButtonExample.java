package practice9_01.sec06;

import practice9_01.sec06.Button.ClickListener;

public class ButtonExample {
	public static void main(String[] args) {

		// 버튼 객체생성
		Button btnOk = new Button();
		Button btnCancel = new Button();

		// 리스너 인터페이스 구현클래스 2개 생성
		class OkListener implements ClickListener {
			@Override
			public void onClick() {
				System.out.println("OK 버튼을 눌렀습니다.");
			}
		}

		class CancelListener implements ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 눌렀습니다.");
			}
		}
		//리스너 객체 넣어주기
		btnOk.setClickListener(new OkListener());
		btnCancel.setClickListener(new CancelListener());
		
		btnOk.click();
		btnCancel.click();
	}
}
