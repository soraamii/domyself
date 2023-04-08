package exam01;

public class Calculator2 {
	
	
	public void add(int a, int b) {
		int result = a + b;
		System.out.println("결과 : " + result);
	}

	public static void main(String[] args) {
		
	Calculator2 cal = new Calculator2();
	
	cal.add(5, 10);
		

	}

}
