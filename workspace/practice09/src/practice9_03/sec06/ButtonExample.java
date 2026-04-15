package practice9_03.sec06;

public class ButtonExample {

	public static void main(String[] args) {
		Button btnOk = new Button();
		Button btnCancel = new Button();
		
		class OkListener implements Button.ClickListener{
			@Override
			public void onClick() {
			System.out.println("OK 버튼이 눌렸습니다.");
				
			}
		}
		class CancelListener implements Button.ClickListener{
			@Override
			public void onClick() {
			System.out.println("Cancel 버튼이 눌렸습니다.");
				
			}
		}
		
		btnOk.setClickListener(new OkListener());
		btnCancel.setClickListener(new CancelListener());
		
		btnOk.click();
		btnCancel.click();
	}
	
}
