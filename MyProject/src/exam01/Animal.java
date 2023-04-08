package exam01;
//Animal 클래스를 생성하고, 
public class Animal {
	
	
	//동물의 종류와 울음소리를 출력하는 printInfo() 메소드를 작성하여 
	// 그 결과를 출력하는 코드를 작성해보세요.
	
	
	// 변수 선언
	
	String species;
	String sound;
	
	// 메소드 생성
	
	public String printInfo() {
		return "종은 " + species + "이고 울음 소리는 " + sound + "입니다.";
	}
	
	// 메인 메소드 생성
	
	public static void main(String[] args) {
		
		// 인스턴스 생성
		
		Animal animal = new Animal();
		
		// 변수 초기화
		animal.species = "개";
		animal.sound = "멍멍";
		
		// 출력
		
		System.out.println(animal.printInfo()); 
		
	}
	
	
	
	
	
	

	
	
}
