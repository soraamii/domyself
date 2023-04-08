package exam01;

public class Person2 {

	// 변수 선언
	String name;
	boolean isMale;
	
	// 메소드 생성 
	
	public void printInfo() {
		String gender = isMale ? "남자" : "여자" ;
		System.out.println("이름 : " + name + " 성별 : " + gender);
	}
	
	
	// 메인 메소드 생성
	public static void main(String[] args) {
		// 인스턴스 생성
		Person2 person = new Person2();
		
		// 변수 초기화
		
		person.name = "이영지";
		person.isMale = false;
		
		
		// 출력
		person.printInfo(); 
		
		
	}
	

}
