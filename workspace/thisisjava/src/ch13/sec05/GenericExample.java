package ch13.sec05;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Course 클래스의 스태틱 메서드 호출 파라미터로 Applicant 객체를 받음 Applicant객체 생성시타입지정 가능");

		System.out.println("2. Applicant 클래스의 생성자로들어갈 각각의 타입은");

		System.out.println("3. Course 클래스의 registerCourse1, registerCourse2, registerCourse3 메서드마다 범위를 정해둠");

		System.out.println();
		
		System.out.println("모든사람 Course :  registerCourse1(Applicant<?>applicant)");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		// registerCourse1 : 모든 사람가능
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<Student>(new HighStudent()));
		Course.registerCourse1(new Applicant<Student>(new MiddleStudent()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		
		System.out.println();
		System.out.println("학생 Course : registerCourse2(Applicant<?extends Student>applicant)");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		// registerCourse2 : 학생만 가능
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<Student>(new HighStudent()));
		Course.registerCourse2(new Applicant<Student>(new MiddleStudent()));
		
		System.out.println();
		System.out.println("직장인 및 일반인 Course : registerCourse3(Applicant<?super Worker>applicant)");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		// registerCourse3 : 직장인 및 일반인만 가능
		Course.registerCourse3(new Applicant<Worker>(new Worker()));

	}

}
