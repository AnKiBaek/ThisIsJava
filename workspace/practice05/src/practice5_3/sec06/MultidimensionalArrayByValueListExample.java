package practice5_3.sec06;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		int[][] scores = {{10,30,40,30},{90,40,20},{10,50,}};
		
		int totalVal =0;
		int totalCount =0;
		double avg = 0;
		for(int i = 0; i< scores.length; i++) {
			totalCount += scores[i].length;
			for(int k = 0; k<scores[i].length;k++) {
				totalVal += scores[i][k];
			}
			
			System.out.println(totalCount);
			System.out.println(totalVal);
			avg = totalVal / totalCount;
			System.out.println(avg);
		}

	}

}
