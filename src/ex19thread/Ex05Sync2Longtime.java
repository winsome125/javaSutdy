package ex19thread;

class Increment{
	int num = 0;
	
	public void increment() {
		num++;
	}
	
	public int getNum() {
		return num;
	}
}

class IncThread extends Thread{
	
	Increment inc;
	
	public IncThread(Increment inc) {
		this.inc = inc;
	}
	
	// 1억번 실행되는 메소드
	public void run() {
		for(int i=1; i<=10000 ; i++) {
			for (int  j=1 ; j<=10000 ; i++) {
				inc.increment();
			}
		}
	}
}

public class Ex05Sync2Longtime {

	public static void main(String[] args) {

		Increment inc = new Increment();
		
		IncThread it1 = new IncThread(inc);
		IncThread it2 = new IncThread(inc);
		IncThread it3 = new IncThread(inc);
		
		it1.start();
		it2.start();
		it3.start();
	}

}
