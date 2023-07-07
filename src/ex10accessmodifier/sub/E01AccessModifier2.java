package ex10accessmodifier.sub;

/*
 E01AccessModifier1 클래스와 선언된 패키지만 다르고 모든 내용이 완전히 동일하게 작성 되었다.
 */

class DefaultClass2 {
	
	void myFunc() {
		System.out.println("DefaultClass클래스의 myFunc()메서드 호출");
	}
}

public class E01AccessModifier2 {
	
	   // 맴버변수 : 3가지의 접근지정자를 통해 선언 
	   private int privateVar;
	   int defaultVar;
	   public int publicVar;
	   
	   // 멤버메서드 : 변수와 동일하게 3가지의 접근지정자를 통해 정의
	   private void privateMethod() {
	      privateVar = 400;
	      System.out.println("privateVar() 메소드 호출");
	   }
	   void defaultMethod() {
	      privateVar = 500;
	      System.out.println("defaultMethod() 메소드 호출");
	   }
	   public void publicMethod() {
	      privateVar = 600;
	      System.out.println("publicMethod() 메소드 호출");
	      privateMethod();
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
