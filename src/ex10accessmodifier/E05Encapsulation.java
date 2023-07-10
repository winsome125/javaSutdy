package ex10accessmodifier;


/*
 캡술화(Encapsulation)
  : 여러가지 업무 로직을 하나로 묶은다는 의미와, 업무의 순서까지 고려한 형태의 로직을 구성한다는 의미를 가지고 있다.
  즉 관련있는 로직을 하나로 묶어주는 것을 말한다.
 */
// 아래 4가지 업무는 번호순서대로 진행해야 한다고 가정한다.
class MemberRegist{
	void doMemberRegist() {
		System.out.println("1.회원가입을 진행합니다.");
	}
}

class CongratulationPoint {
	void doCongratulationPoint() {
		System.out.println("3.가입 축하 10 포인트 ");
	}
}

class AutoLongin {
	void doAutoLongin()	{
		System.out.println("2.자동로그인");
	}
}

class FirstLoginEvent {
	void doFirstLonginEvent() {
		System.out.println("4.첫 로그인 이벤트 페이지로 이동합니다. ");
	}
}

/*
업무의 순서를 고려하여 관련된 메서드를 하나의 클래스로 정의한다.
차후에느 별도의 분석 작업없이 해당 클래스의 doProcess() 메서드만 호출하면 업무는 차질없이 진행될것이다. 
 */
class EncapsulLogic {
	// 각 업무를 담당할 클래스를 통해 인스턴스를 생성한다.
	MemberRegist memberRegist = new MemberRegist();
	FirstLoginEvent firstLonginEvent = new FirstLoginEvent();
	AutoLongin autoLongin = new AutoLongin();
	CongratulationPoint congratulationPoint = new CongratulationPoint();
	
	// 업무의 순서를 고려하여 캡술화된 메서드를 정의한다.
	void doProcess() {
		memberRegist.doMemberRegist(); // 1.가입
		autoLongin.doAutoLongin(); // 2.로그인
		congratulationPoint.doCongratulationPoint(); // 3.축하포인트지급
		firstLonginEvent.doFirstLonginEvent(); // 4.이벤트페이지
	}
}

public class E05Encapsulation {

	public static void main(String[] args) {

		System.out.println("캡슐화 전 코드");
		/*
		 업무의 진행순서가 중요하다고 가정했을 때 캡술화 이전의 코드에서는 개발자가 순서를 지키지 않은 상태에서도 실행이 가능한 코드가 된다.
		 즉 업무의 차질이 발생될 수 있다.
		 */
		MemberRegist memberRegist = new MemberRegist(); 
		FirstLoginEvent firstLonginEvent = new FirstLoginEvent();
		AutoLongin autoLongin = new AutoLongin();
		CongratulationPoint congratulationPoint = new CongratulationPoint();
		
		memberRegist.doMemberRegist(); // 회원가입
		firstLonginEvent.doFirstLonginEvent(); // 이벤트페이지이동
		congratulationPoint.doCongratulationPoint(); // 축하포인트지급
		autoLongin.doAutoLongin();// 자동로그인
		
		System.out.println("==================================");
		
		// 아래 메서드 호출을 통해 업무를 순서에 맞게 진행할 수 있다.
		System.out.println("캡술화 이후 코드");
		new EncapsulLogic().doProcess();
	}

}
