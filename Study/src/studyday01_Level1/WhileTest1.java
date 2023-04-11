package studyday01_Level1;

public class WhileTest1 {

	public static void main(String[] args) {
		// while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.
		// 한 행에 10개씩만 출력하기
		int num = 1;
		int sum = 0;
		while(num < 100) {
			sum += num;
			num++;
		}System.out.println(sum);
		
		
		int sum2 = 0;
		//for문을 이용해서도 만들어보기
		for(int i = 1; i < 100; i++) {
			sum2 += i;
		}System.out.println(sum2);

	}

}
