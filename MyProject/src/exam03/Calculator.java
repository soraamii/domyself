package exam03;

import java.util.Scanner;

public class Calculator {
	

	// 변수 선언
	
	int a;
	int b;

	//① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
	
	void add(int a, int b) {
		System.out.println(a + b);
	}
	//② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의
	
	void minus(int a, int b) {
		System.out.println(a - b);
	}
	//③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의
	
	void mul(int a, int b) {
		System.out.println(a * b);
	}
	//④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의
	
	void div (int a, int b) {
		System.out.println(a / b);
	}
	
	float r;

	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public Calculator(float r){
		this.r = r;
	}
	
	//⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
	
	public float turn(float r) {
		return (float) (2 * Math.PI * r);
	}
	
	//⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
	//원의 둘레 : 2 x π x r , 월의 넓이 : π x r x r
	
	public float width(float r) {
		return (float) (Math.PI * r * r);
	}
	
	
	
	
	//⑦ main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
	
	public static void main(String[] args) {
		
		Calculator cal1 = new Calculator(10, 5);
		Calculator cal2 = new Calculator(30.8f);
		
		
			
		cal1.add(10, 5);
		cal1.minus(10, 5);
		cal1.mul(10, 5);
		cal1.div(10, 5);
		System.out.println(cal2.turn(30.4f));
		System.out.println(cal2.width(30.8f));
		
		System.out.println("------------------------------");
		
		//⑧ 콘솔에서 사용자에게 데이터를 받아 
		
		Scanner sc = new Scanner(System.in);
		
		//메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 
				//main() 메소드에 추가해봅시다.
		
		System.out.println("첫 번째 값을 입력하세요. >");
		int a = sc.nextInt();
		System.out.println("두 번째 값을 입력하세요. >");
		int b = sc.nextInt();
		
		System.out.println("a + b : " + (a + b));
		
		
		
	}

	
}
