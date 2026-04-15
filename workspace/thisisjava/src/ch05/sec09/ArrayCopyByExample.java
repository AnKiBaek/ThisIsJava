package ch05.sec09;

public class ArrayCopyByExample {

	public static void main(String[] args) {
		//길이가 3인 배열
		int[] oldIntArray = {1,2,3};
		//길이가 5인 배열 새로 생성
		int[] newIntArray = new int[5];
		
		//old>>>>new배열복사
		for(int i = 0; i < oldIntArray.length ; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		//배열 출력
		for(int i = 0 ; i <newIntArray.length ; i++) {
			System.out.println(newIntArray[i]);
		}

//		System.arraycopy(oldIntArray, 0, newIntArray,2,oldIntArray.length);
//		//배열 출력
//		for(int i = 0 ; i <newIntArray.length ; i++) {
//			System.out.println(newIntArray[i]);
//		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		int[] arrOld = {1,2,3,4,5};
		
		int[] arrNew = new int[7];
		
		for(int i = 0; i < arrOld.length; i++) {
			arrNew[i] = arrOld[i]; 
		}
		
		for(int i = 0; i< arrNew.length; i++) {
			System.out.println(arrNew[i]);
		}


	}

}
