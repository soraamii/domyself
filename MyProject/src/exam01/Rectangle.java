package exam01;

//Rectangle 클래스를 생성하고,

public class Rectangle {

	// 직사각형의 너비와 높이를 받아 면적을 계산하는 getArea() 메소드를 작성하여
	// 그 결과를 출력하는 코드를 작성해보세요.
	
	// 변수 
	
	int width;
	int height;
	
	// 생성자
	
	//public Rectangle(int width, int height) {
		//this.width = width;
		//this.height = height;
		
	//}
	
	//메소드 
	
	public int getArea() {
		return width * height;
	}
	
	
	// 메인 메소드
	public static void main(String[] args) {
	
		Rectangle rt = new Rectangle();
		rt.width = 50;
		rt.height = 200;
		
		System.out.println(rt.getArea());

	}

}
