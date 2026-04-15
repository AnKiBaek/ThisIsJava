package ch15.sec02.exam01;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		// Board 클래스타입 객체만 사용할수있는 List 인터페이트 타입의 ArrayList 구현 객체로 객체화.
		List<Board> list = new Vector<>();

		// add(new Board객체로 5세트 list 변수안에 등록 순서대로 등록됨.)
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));

		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체의 수: " + size + "개");
		System.out.println();

		// 특정 인덱스의 객체 가져오기 (언박싱)
		Board board = list.get(3);

		System.out.println(board.getSubject());
		System.out.println(board.getContent());
		System.out.println(board.getWriter());

		System.out.println();

		// 모든객체 하나씩 가져오기
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject() + b.getContent() + b.getWriter());
		}

		System.out.println();

		// 객체 삭제 3,4 객체 사라짐
		list.remove(2);
		list.remove(2);

		// 향상된 for 문으로 객체 하나씩 가져오기
		for (Board b : list) {
			System.out.println(b.getSubject() + b.getContent() + b.getWriter());
		}

	}

}
