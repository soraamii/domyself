package Exam005;

public class Member {

	// Member 클래스에는 아래 요구사항에 맞는 변수와 메소드를 정의하고,
	// main()메소드 에 해당 메소드를 호출해서 결과를 확인해보세요.
	// 단 인스턴스의 생성은 생성자를 이용해서 초기화하는 코드를 작성해 봅시다.

	// ① 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소

	// 변수 생성

	private String name;
	private String phoneNumber;
	private String major;
	private int grade;
	private String email;
	private String birthday;
	private String address;

	// ③ 모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의

	// 생성자 생성

	public Member(String name, String phoneNumber, String major, int grade, String email, String birthday,
			String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}

	public Member(String name, String phoneNumber, String major, int grade, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;

	}

	// Getter/Setter 생성

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// ② 위에서 정의한 정보를 출력하는 메소드 정의

	public void printdata() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("이메일 : " + email);
		System.out.println("생일 : " + (birthday != null ? birthday : "미입력"));
		System.out.println("주소 : " + (address != null ? address : "미입력"));

	}

	// ④ main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고
	// 출력 메소드를 통해 저장된 데이터 출력
	public static void main(String[] args) {

		// 인스턴스 생성
		Member member1 = new Member("강백호", "010-1111-2222", "야구", 50, "bh_k@gmail.com", "1997-07-29", "수원시");
		Member member2 = new Member("소형준", "010-1111-3333", "야구", 30, "hj_so@gmail.com");
		
		member1.printdata();
		System.out.println();
		System.out.println("↓생일, 이메일이 없는 정보");
		System.out.println();
		member2.printdata();
		

	}

}
