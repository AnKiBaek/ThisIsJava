package practice5_8.sec06;

public class ArrayCreateByExample {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		for(int i :arr1) {
			System.out.println(i);
		}
		double[] arr2 = new double[3];
		for(double i :arr2) {
			System.out.println(i);
		}
		String[] arr3 = new String[3];
		for(String s: arr3) {
			System.out.println(s);
		}
	}

}
