package ch09.sec06.exam03;

public class Mp3 {

	// mp3를 만든다. 
	// 노래는 pop , rnb , kpop,jpop 4가지
	
	//필드선언
	private PlayListener playListener;
	
	//setter
	public void setPlayListener(PlayListener playListener) {
		this.playListener = playListener;
	}
	
	//노래 틀기
	public void playMusic() {
		playListener.play();
	}
	
	//중첩 인터페이스 
	public static interface PlayListener {
		public void play();
	}
}
