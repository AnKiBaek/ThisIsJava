package ch17.sec04.exam04;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) throws Exception{
		// 파일 스트림 얻기
		
		//date.txt 리소스의 경로를 path 에저장
		Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
		//path값과 기본 인코딩형식을 파라미터로 줘서 date.txt 의 내용을 한줄씩 stream을 얻는다.
		Stream<String>stream = Files.lines(path,Charset.defaultCharset());
		// line 객체를 반복출력한다.
		stream.forEach(line -> System.out.println(line));
		// 스트림 닫기 왜 닫는지는 연구필요
		stream.close();
	}

}
