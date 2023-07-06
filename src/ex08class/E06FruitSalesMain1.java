package ex08class;

class FruitSeller{
	int numOfApple = 100;
	int myMoney = 0;
	final int APPLE_PRICE = 100;
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}

class FruitBuyer {
	
	int myMoney = 5000;
	int numOfApple = 0;

	public void buyApple(FruitSeller seller, int money) {
		
	}
}

public class E06FruitSalesMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
