package practice5_5.sec06;

public class ArrayCreateExample {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		for(int i : arr1) {
			System.out.println(i);
		}
		
		arr1[0]= 1;
		arr1[1]= 2;
		arr1[2]= 3;
		
		System.out.println();
		
		for(int i : arr1) {
			System.out.println(i);
		}
		
		System.out.println();
		
		double[] arr2 = new double[3];
		
		for(double d:arr2) {
			System.out.println(d);
		}
		
		arr2[0]= 1;
		arr2[1]= 3;
		arr2[2]= 2;
		
		System.out.println();
		
		for(double d:arr2) {
			System.out.println(d);
		}
		
		String[] arr3 = new String[3];
		
		System.out.println();
		
		for(String s: arr3) {
			System.out.println(s);
		}
		
		arr3[0] ="우";
		arr3[1] ="테";
		arr3[2] ="코";
		
		System.out.println();
		for(String s: arr3) {
			System.out.printf(s);
		}
		

	}

}
