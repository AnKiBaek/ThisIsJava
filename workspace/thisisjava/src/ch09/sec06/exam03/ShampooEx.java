package ch09.sec06.exam03;

public class ShampooEx {
	
	public static void main(String[] args) {
		
		Shampoo kerrasis = new Shampoo();
		Shampoo happyBath = new Shampoo();
		
		class Kerrasis implements Shampoo.ShampooEventListener{
			@Override
			public void shampooPush() {
				System.out.println("캐라시스 샴푸나옴");
				
			}
		}
		
		class HappyBath implements Shampoo.ShampooEventListener{
			@Override
			public void shampooPush() {
				System.out.println("해피바스 샴푸나옴");
				
			}
		}
		
		kerrasis.setShampooEventListener(new Kerrasis());
		happyBath.setShampooEventListener(new HappyBath());
		
		kerrasis.push();
		happyBath.push();
	}

}
