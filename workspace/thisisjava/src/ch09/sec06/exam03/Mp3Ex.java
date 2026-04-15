package ch09.sec06.exam03;

import ch09.sec06.exam03.Mp3.PlayListener;

public class Mp3Ex {
	
public static void main(String[] args) {
	


	Mp3 americaMp3 = new Mp3();
	Mp3 rnbMp3 = new Mp3();
	Mp3 koreaMp3 = new Mp3();
	Mp3 japanMp3 = new Mp3();
	
	
	class Pop implements Mp3.PlayListener{

		@Override
		public void play() {
			System.out.println("팝송재생");
			
		}
		
		}
	
	class Rnb implements Mp3.PlayListener{
		@Override
		public void play() {
			System.out.println("알앤비 재생");
			
		}
	}
	class Kpop implements Mp3.PlayListener{
		@Override
		public void play() {
			System.out.println("케이팝 재생");
			
		}
	}class Jpop implements Mp3.PlayListener{
		@Override
		public void play() {
			System.out.println("제이팝 재생");
			
		}
	}
	
	koreaMp3.setPlayListener(new Kpop());
	
	koreaMp3.playMusic();
}

}
