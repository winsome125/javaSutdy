package ex01start;

import java.text.SimpleDateFormat;
import java.util.Date;

public class E01JavaStruct {

	public static void main(String[] args) {
		
		//오늘날짜와 시간을 Date클래스를 통해 가져온다.
		Date toDayofDate = new Date();
		System.out.println("오늘날짜:"+ toDayofDate);
		
		/*
		 우리가 주로 사용하는 날짜포맷인 년-월-일 시:분:초 형태로 변환한 후 출력한다.
		 */
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-NN-dd HH:mm:ss");
		String toDayString = simple.format(toDayofDate);
		System.out.println("변형된날짜:"+ toDayString);

	}

}
