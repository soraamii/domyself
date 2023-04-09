package ifExam;

import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		//사용자로부터 숫자를 입력받아, 
		// 해당 숫자가 10보다 크면 "크다", 10보다 작으면 "작다", 10과 같으면 "같다"라는 메시지를 출력하는 프로그램을 작성하세요.
		
		// 스캐너 생성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력해 주세요");
		
		
		// 변수 선언
		
		int num = sc.nextInt();
		
		// if문 작성
		
		if(num > 10) {
			System.out.println("크다");
		} else if(num < 10) {
			System.out.println("작다");
		} else {
			System.out.println("같다");
		}
		
		
		
		
		



	}

}
