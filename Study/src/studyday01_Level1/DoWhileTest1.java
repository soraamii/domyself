package studyday01_Level1;

public class DoWhileTest1 {

	public static void main(String[] args) {
		// 1부터 100까지 출력한 후, 다시 거꾸로 100부터 1까지 출력하는 프로그램을 작성
		
		int num = 1;
		do {
			System.out.println(num);
			num++;
		}while(num < 101);
		
		System.out.println("-------------------");
		
		int num2 = 100;
		do {
			System.out.println(num2);
			num2--;
		}while(num2 > 0);

	}

}
