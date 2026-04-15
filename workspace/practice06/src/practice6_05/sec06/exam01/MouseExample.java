package practice6_05.sec06.exam01;

public class MouseExample {

	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		Mouse mouse2 = new Mouse("MicroSoft",120000);
		
		System.out.println(mouse.model);
		System.out.println(mouse.company);
		System.out.println(mouse.price);
		
		System.out.println(mouse2.model);
		System.out.println(mouse2.company);
		System.out.println(mouse2.price);

	}

}
