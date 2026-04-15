package practice9_02.sec06;

public class ButtonExample {

	public static void main(String[] args) {

		// 왜 Ok , Cancel 객체를 두갤 만들었을까?
		// 해답: Button 클래스는 설계도일뿐 객체를 만들어서 동작시켜야하는데 단지 버튼이 두개가 필요했을뿐이다. 
		Button btnOk = new Button();
		Button btnCancel = new Button();

		// 왜 클래스를 여기서만들었으며 , 왜 굳이 두개를 만들었을까
		// 해답: main 메서드안에 선언된이유는 다른 클래스를 따로만들어서 구현할경우 설계가 더욱복잡해지고,
		// main 메서드안에서만 활용되고 버려질 녀석들이기때문. 응집도 향상
		// 익명객체방식이나 람다식으로 업그레이드되어 사용하게된다. 
		// 다형성을위해 두개 구현
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("OK버튼을 눌렀습니다.");
			}
		}

		class CancelListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancel버튼을 눌렀습니다. ");
			}
		}
		
		//왜 외부클래스객체의 메서드에 네스티드 인터페이스 의 구현 클래스의 객체를 파라미터로 넣었을까
		//해답 : Button 클래스의 setClickListener메서드는 인터페이스타입 객체를 파라미터를 받게 설정되어있다.
		//또한 click 메서드는 인터페이스에선언된 추상메서드를 실행하게 되어있으므로 구현클래스가무엇이냐에따라서 
		//출력결과가 달라지는것!
		btnOk.setClickListener(new OkListener());
		btnCancel.setClickListener(new CancelListener());
		
		btnOk.click();
		btnCancel.click();

	}
}
