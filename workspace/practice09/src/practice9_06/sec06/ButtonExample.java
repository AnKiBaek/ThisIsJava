package practice9_06.sec06;

public class ButtonExample {

	public static void main(String[] args) {
		Button btnOk = new Button();
		Button btnCancel = new Button();
		
		class OkListener implements Button.ClickListener{
			@Override
			public void onClick() {
			    System.out.println("Ok");
			}
		}
		class CancelListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancel");	
			}
		}
		
		btnOk.setClickListener(new OkListener());
		btnCancel.setClickListener(new CancelListener());
		
		btnOk.click();
		btnCancel.click();
	}
}
