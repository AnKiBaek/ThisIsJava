package ch12.sec05;

import java.util.Arrays;

public class BytesToStringExample {

	public static void main(String[] args) {
	
		String data = "자바";
		
		//인코딩
		byte[] arr1 = data.getBytes();
		//디코딩  
		String newDate = new String(arr1);
		
		
		// 한글 1글자 3바이트
		System.out.println(arr1.length);
		//Arrays 클래스의 toString()로 arr1 객체의 요소값을 출력해준다. 
		System.out.println(Arrays.toString(arr1));

		//디코딩된 값
		System.out.println(newDate);
	}

}
