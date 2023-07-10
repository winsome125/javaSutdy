package ex12inheritance;

class Computer{
	
	String owner;
	
	//public Computer(	{
	public Computer(String name) {
		owner = name;
	}
	private void keyboardTouch() {
		System.out.println("키보드를 통해서 입력한");
	}
	private void calculate() {
		System.out.println("요청된 내용을 계산한다.");
	}
	public void calculategunc() {
		keyboardTouch();
		calculate();
	}
}

public class E04ISAInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
