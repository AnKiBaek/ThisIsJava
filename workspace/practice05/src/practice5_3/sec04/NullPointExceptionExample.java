package practice5_3.sec04;

public class NullPointExceptionExample {
	public static void main(String[] args) {
		String[] strArr = null;
		
		strArr[0]=  "sds";
		strArr[1]=  "sds";
		strArr[2]=  "sds";
		strArr[3]=  "sds";
		strArr[4]=  "sds";
		strArr[5]=  "sds";
		strArr[6]=  "sds";
		
		for(String strVal : strArr) {
			System.out.println(strArr);
		}
		
	}

}
