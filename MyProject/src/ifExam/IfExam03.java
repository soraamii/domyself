package ifExam;

import java.util.Scanner;

public class IfExam03 {

	public static void main(String[] args) {
		
		//두 수를 입력받아, 
		//더한 결과가 100보다 크면 "100보다 큽니다.", 
		//100보다 작으면 "100보다 작습니다.", 
		//100과 같으면 "100입니다."라는 메시지를 출력하는 프로그램을 작성하세요.
		
		
		// 스캐너
		Scanner sc = new Scanner(System.in);
		//입력 메소드
		System.out.println("첫 번째 값을 입력해 주세요.");
		int a = sc.nextInt();
		System.out.println("두 번째 값을 입력해 주세요.");
		int b = sc.nextInt();
		
		//if문
		if(a + b > 100) {
			System.out.println("100보다 큽니다.");
		} else if(a + b < 100) {
			System.out.println("100보다 작습니다.");
		} else {
			System.out.println("100입니다.");
		}
		
		

	}

}
