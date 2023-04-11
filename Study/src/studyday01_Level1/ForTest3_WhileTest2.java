package studyday01_Level1;

public class ForTest3_WhileTest2 {

	public static void main(String[] args) {
		//1부터 100까지 출력한 후, 다시 거꾸로 100부터 1까지 출력하는 프로그램을 작성
		
		for(int i = 1; i < 101; i++) {
			System.out.println(i);
		}
		
		System.out.println("---------------");
		
		for(int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		
		
		System.out.println("----------심화2---------");
		
		for(int i = 1; i < 101 ; i++) {
			System.out.print(i + " ");
			if(i % 10 == 0 ) {
				System.out.println();
			}
		}
	
	

	}
}


