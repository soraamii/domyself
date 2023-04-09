package forExam;

public class ForExam002 {

	public static void main(String[] args) {

		for (int j = 1; j <= 9; j++) { // 1부터 9까지 반복
			for (int i = 2; i <= 9; i++) { // 2단부터 9단까지 반복
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");//구구단 출력
			}
			System.out.println(); // 다음 줄로 넘어감
		}

	}

}
