package ex07string;

public class E02StringMethod4 {

	public static void main(String[] args) {

		System.out.println("String 클래스의 주요 메소드2");
//		String str1 = ;
		/*
		시나리오] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		
		System.out.println("### 시나리오1 ###");
		String juminNum = "190419-4000000";
		
		/* 
		 
		 */
		
		if(juminNum.charAt(7)=='1' || juminNum.charAt(7)=='3') {
			System.out.println("남자입니다.");
		}
		if(juminNum.charAt(7)=='2' || juminNum.charAt(7)=='4') {
			System.out.println("여자입니다.");
		}
		if(juminNum.charAt(7)=='5' || juminNum.charAt(7)=='7') {
			System.out.println("외국인입니다.");
		}
		
		/*
		시나리오]주민등록번호로 성별을 구분하는 프로그램을 indexOf()를
		이용해서 작성하시오.
		*/	
		
		System.out.println("### 시나리오2 ###");
		String jumin = "190419-4000000";
		
		
		
		/*
		시나리오] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		
		// 복습시
		System.out.println("### 3 ###");
		String email = "hong@daum.net";
		/*
		 이메일은 아이디와 도메인을 구분하는 @(엣)과 도메인 부분에 .(닷)
		 */
		if(email.contains(email)) {
			
		}
		

		
		
		
		/*
		시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/


	}

}
