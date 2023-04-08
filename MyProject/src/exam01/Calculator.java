package exam01;

//Calculator 클래스를 생성하고,

public class Calculator {
	
	 
	
	// 그 결과를 출력하는 코드를 작성해보세요.
	
	//인스턴스 생성
	
	int a;
	int b;
	
	// 생성자 생성
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	

	// 두 개의 정수를 더하는 add() 메소드를 작성하여 
	
	//메소드 생성
	
	public void add() {
		System.out.println(a+b);
	}
	
	

	public static void main(String[] args) {
		
		//인스턴스 생성
		
	Calculator cal = new Calculator(1, 5);
		
		//출력
	
	cal.add();
		
		
		

	}

}
