package ch05.sec06;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] scores =  {
			{70,92,32},
			{60,93}
		};
		
		//배열의 길이 조회
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		
		System.out.println("____________________");
		
		//점수의 합산
		int groupValCount = 0;
		int grouptotalVal = 0;
		double groupValAvg = 0;
		for(int i = 0; i <scores.length; i++) {
			groupValCount += scores[i].length;
			for(int k = 0; k < scores[i].length ; k++) {
				grouptotalVal +=scores[i][k]; 
			}
		}
		groupValAvg = grouptotalVal/groupValCount;
		
		System.out.println(groupValCount);
		System.out.println(grouptotalVal);
		System.out.println(groupValAvg);

	}

}
