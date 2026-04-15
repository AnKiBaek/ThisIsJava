package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		//구분자 & / 포함 문자열 리터럴 초기화
		String data = "안기백&기백/기잭";
		
		// 구분자 기준 split 으로 분할해서 stArr[] 에 저장
		String[] stArr = data.split("&|/");
		
		// token 변수에 stArr[] 값을 하나씩 옮기며 하나씩 출력.
		for(String token: stArr) {
			System.out.println(token);
		}
		
		System.out.println();
		
		String data2 = "안기백/기백/백";
		
        StringTokenizer st = new StringTokenizer(data2,"/");
        
        st.countTokens();
        
        while(st.hasMoreTokens()) {
          String token =  st.nextToken();
          
          System.out.println(token);
        }

	}

}
