package practice9_08.sec06;

public class Button {

	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		clickListener.onClick();
	}
	
	public static interface ClickListener {
		public void onClick();
	}
}
