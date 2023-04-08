package exam01;

//Student 클래스를 생성하고, 

public class Student {

	// 학생의 이름과 나이를 출력하는 printInfo() 메소드를 작성하여
	// 그 결과를 출력하는 코드를 작성해보세요.
	
	public void printInfo(String name, int age) {
		
		System.out.println("저의 이름은 "+ name + "입니다. 나이는 " + age + "살입니다.");
	}
	
	
	public static void main(String[] args) {
		
		Student studentInfo = new Student();
		
		studentInfo.printInfo("전미르", 19);

	}

}
