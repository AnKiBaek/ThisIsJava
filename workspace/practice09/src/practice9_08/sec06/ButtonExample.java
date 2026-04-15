package practice9_08.sec06;

public class ButtonExample {

	public static void main(String[] args) {
		Button btnOk = new Button();
		Button btnCancel = new Button();
		
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
			System.out.println("Ok버튼");
				
			}
		}
		class CancelListener implements Button.ClickListener{
			@Override
			public void onClick() {
			System.out.println("Cancel버튼");
				
			}
		}
		
		btnOk.setClickListener(new OkListener());
		btnCancel.setClickListener(new CancelListener());
		
		btnOk.click();
		btnCancel.click();
	}
	
	
}
