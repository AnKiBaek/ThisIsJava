package practice9_09.sec06;

public class Button {
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		clickListener.onClick();
	}

	//자동으로 static이 붙는다.
public interface ClickListener {
	public void onClick();
}
}
