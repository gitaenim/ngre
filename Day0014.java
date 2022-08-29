package day0829;

public enum Day0014 {
	//열거상수
	//변수선언
	//열거형타입 변수이름;
	//사용법 : 열거타입.상수
	//이 클래스의 이름 Day0014
	MON("월"),//0
	TUE("화"),//1
	WED("수"),//2
	THU("목"),//3
	FRI("금"),//4
	SAT("토"),//5
	SUN("일");//6
	
	public String dow;
	Day0014(String dow){
		this.dow=dow;
	}
	
	//컴파일시 java.lang.Enum을 상속처리해서 컴파일이 이뤄진다.

	
}
