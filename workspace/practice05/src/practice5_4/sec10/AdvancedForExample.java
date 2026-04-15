package practice5_4.sec10;

public class AdvancedForExample {

	public static void strArrReader(String[]strArr) {
		String strVal = "";
		
		for(String val : strArr) {
			strVal += val;
		}
		System.out.println(strVal);
				
	}
	public static void main(String[] args) {
		String[] textArr = {"우","테","코"};
		
		strArrReader(textArr);
		
	}
	
}
