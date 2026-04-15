package ch05.sec06;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		//배열변수 선언과 배열 생성
		int[] arr1 = new  int[3];
		//배열 항목의 초기값 출력
		for(int i=0 ; i<arr1.length ; i++) {
			System.out.println(arr1[i]);
		}
	
		
		arr1[0] =1;
		arr1[1] =2;
		arr1[2] =3;
		
		for(int i=0 ; i<arr1.length ; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("------------------");
		double[] arr2 = new double[3];
		
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
		
		arr2[0]=0.1;
		arr2[1]=0.2;
		arr2[2]=0.3;
		
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("------------------");
		String[] arr3 = new String[3];
		for(int i=0 ; i<arr3.length ; i++) {
			System.out.println(arr3[i]);
		}
		
		arr3[0]="우";
		arr3[1]="테";
		arr3[2]="코";
		
		for(int i =0 ; i<arr3.length;i++) {
			System.out.println(arr3[i]);
			
		}
		

	}

}
