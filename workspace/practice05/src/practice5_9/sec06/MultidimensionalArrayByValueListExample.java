package practice5_9.sec06;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		int[][] arr = {{10,20,30},{10,20,30}};
		
		int totalVal = 0;
		int totalCount = 0;
		double avg = 0;
		
		for(int i = 0; i < arr.length; i++) {
			totalCount += arr[i].length;
			 for(int k = 0; k<arr[i].length; k++) {
				 
				 totalVal += arr[i][k];
				 
			
			 }
			
			 System.out.println(totalCount);
			 System.out.println(totalCount);
			 avg = totalVal / totalCount;
			 System.out.println(avg);
		}
        
	}

}
