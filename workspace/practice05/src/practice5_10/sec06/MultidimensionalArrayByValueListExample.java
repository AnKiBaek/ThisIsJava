package practice5_10.sec06;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] score = {{20,10,20},{20,30}};
		
		//배열의길이 조회
		System.out.println("score배열의 길이: " + score.length);
		System.out.println("score배열의 길이: " + score[0].length);
		System.out.println("score배열의 길이: " + score[1].length);
		
		System.out.println();
		
		//점수의 합산
		int totalValueCount = 0;
		int totalValue = 0;
		
		for(int i = 0 ;  i<score.length;i++) {
			totalValueCount += score[i].length;
			
			for(int k = 0 ; k<score[i].length; k++) {
				totalValue += score[i][k];
			}
		}
		
		System.out.println("전체요소갯수: "+totalValueCount);
		System.out.println("요소를 전부 더한값: " +totalValue);
		
		int avg = totalValue / totalValueCount ;
		
		
		System.out.println("전체평균: "+ avg);
		

	}

}
