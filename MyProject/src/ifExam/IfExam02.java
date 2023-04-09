package ifExam;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		// 사용자로부터 성별('M' 또는 'F')과 나이를 입력받아,
		// 성별이 'M'이고 나이가 18 이상이면 "남성 성인입니다.",
		// 성별이 'F'이고 나이가 18 이상이면 "여성 성인입니다.",
		// 그 외의 경우에는 "미성년자입니다."라는 메시지를 출력하는 프로그램을 작성하세요.

		// 스캐너 생성
		Scanner sc = new Scanner(System.in);

		// 성별을 입력 받고
		System.out.println("성별을 입력해 주세요.");

		String mf = sc.nextLine();
		
		// 나이를 입력 받아
		System.out.println("나이를 입력해 주세요.");
	
		int age = sc.nextInt();

		// if문 생성
		if(mf.equals("m") && age >= 18) {
			System.out.println("남성 성인입니다.");
		}else if(mf.equals("f") && age >= 18) {
			System.out.println("여성 성인입니다.");
		}else {
			System.out.println("미성년자입니다.");
		}
	}

}
