package exam01;

//2. Member 클래스를 생성하고, 
public class Member {

	// 1. MyProject라는 프로젝트를 생성해봅시다.

	// main()메소드를 만들고 자기 자신의 이름을 출력하는 메소드를 만들어 출력해 봅시다.

	// Member 클래스에 main() 메소드 안에 아래 조건의 변수를 정의해봅시다. 
	//① String 타입의 이름을 저장할 수 있는 변수 name을 정의해봅시다.
	//② int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다.
	//③ double 타입의 키를 저장할 수 있는 변수 height를 정의해봅시다.
	//④ boolean 타입의 JAVA책의 보유 여부를 저장할 수 있는 변수 hasBook를 정의해봅시다.
	//⑤ 이름과 나이, 키, 책의 보유 여부를 출력해봅시다.
	public static void main(String[] args) {

		String name = "박영현";
		int age = 21;
		double height = 183.5;
		boolean hasBook = false;
		
	
		System.out.println("제 이름은 " + name + "입니다.");
		System.out.println("제 나이는 " + age);
		System.out.println("키는 " + height + "cm입니다.");
		if(hasBook == false) {
			System.out.println("책이 없습니다.");
		} else {
			System.out.println("책이 있습니다.");
		}
		
	}

}
