package exam01;

public class Calculator3 {

	
	
	//3. Calculator 클래스를 정의해 봅시다. 
	
	// 변수
	int a;
	int b;
	
	// 생성자
	
	public Calculator3 (int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//① 숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.
	
	void add() {
		System.out.println(a + b);
	}
	//② 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
	void minus() {
		System.out.println(a - b);
	}
	//③ 숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
	void multi() {
		System.out.println(a * b);
	}
	
	//④ 숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
	
	void div() {
		System.out.println(a / b);
	}
	
	
	
	public static void main(String[] args) {
		
		// 인스턴스
		
		Calculator3 cal = new Calculator3(10, 5);
		
		
		
		// 출력
		cal.add();
		cal.minus();
		cal.multi();
		cal.div();
		
		
	}
}
