package exam01;

// Person 클래스를 생성하고, 

public class Person {

	// 사람의 이름과 성별을 출력하는 printInfo() 메소드를 작성하여
	// 그 결과를 출력하는 코드를 작성해보세요.

	// 변수 선언
	String name;
	String sex;

	// 생성자 생성
	public Person(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	// 메소드 생성
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + sex);
	}

	// 메인 메소드도 생성

	public static void main(String[] args) {

		// 인스턴스 생성

		Person person = new Person("홍길동", "남");

		// 출력

		person.printInfo();

	}

}
