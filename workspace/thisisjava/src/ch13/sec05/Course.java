package ch13.sec05;

public class Course {

	//모든사람이면 등록가능
	public static void registerCourse1(Applicant<?>applicant) {
		//수강신청 클래스의 (Applicant) 멤버필드 kind 에 대입되는 클래스정보를 출력
		System.out.println("registerCourse1: "+applicant.kind.getClass().getSimpleName());
	}
	
	//학생만 등록가능
	public static void registerCourse2(Applicant<?extends Student>applicant) {
		//수강신청 클래스의 (Applicant) 멤버필드 kind 에 대입되는 클래스정보를 출력
		System.out.println("registerCourse2: "+applicant.kind.getClass().getSimpleName());
	}
	
	//직장인 및 일반인만 등록가능
		public static void registerCourse3(Applicant<?super Worker>applicant) {
			//수강신청 클래스의 (Applicant) 멤버필드 kind 에 대입되는 클래스정보를 출력
			System.out.println("registerCourse3: "+applicant.kind.getClass().getSimpleName());
		}
	
	
}
