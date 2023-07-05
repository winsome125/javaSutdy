package ex05method;

public class E07Overloading {
	
	static void person(int juminNum, int milNum) {
		System.out.println("군필자 이시군요");
		System.out.println("주민번호:"+ juminNum);
		System.out.println("군번:"+ milNum);
	}
	
	static void person(int juminNum) {
		System.out.println("미필자이거나 여성이시군요");
		System.out.println("주민번호:"+ juminNum);
	}
	static void person(int juminNum) {
		System.out.println("미필자거나 여성이시군요");
		System.out.println("주민번호:"+ juminNum);
		return 1;
	}

	public static void main(String[] args) {
		//매개변수가 2개인 메서드 호출(남성)
		person(123456, 7890123);
		System.out.println("======================");
		//매개변수가 1개인 매서드 호출(여성)
		person(987654);
	}

}
