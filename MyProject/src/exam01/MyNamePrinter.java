package exam01;

// MyNamePrinter 클래스를 생성하고,


public class MyNamePrinter {
	
	
	public void printMyName() {
		System.out.println("이소람");
	}
	
	// main() 메소드 안에서 MyNamePrinter 객체를 생성
	// 그 객체의 printMyName() 메소드를 호출하여 
	// 자신의 이름을 출력하는 코드를 작성
	
	public static void main(String[] args) {
		
		MyNamePrinter myNamePrinter = new MyNamePrinter();
		
		
		myNamePrinter.printMyName();

	}

}
