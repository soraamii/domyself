package forExam;

public class ForExam003 {

	public static void main(String[] args) {

		//1. for문을 사용하여 1에서 10까지의 숫자를 출력하시오.
		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		
		
		//2. for문을 사용하여 1에서 20까지의 홀수를 출력하시오.
		
//		for(int i = 1; i < 21; i += 2) {
//			System.out.println(i);
//		}

		//3. for문을 사용하여 1부터 100까지의 합을 구하시오.
		//합 변수 선언
		int sum = 0;
		
		for(int i = 1; i <=100; i++) {
			sum += i;
			System.out.println("지금까지의 합계 : " + sum);
		}
		System.out.println(sum);

	}

}
