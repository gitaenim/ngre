package day0829;

public class Bank02 {
	
	
	String name;
	static double rate;//클래스변수:클래스이름.필드&변수이름으로 접근함
					   //정적변수(정적메모리에 할당됨)
	long money;
	
	
	public Bank02(long money) {
		this.money=money;
		System.out.println("통장개설");
	}

	public Bank02() {
		System.out.println("통장개설");
	}
	//static 변수는 객체최초생성시(or필드사용시) 단 한번만 실행 됨

	static {
		rate=2.5;
		System.out.println("이자율적용");
	}
	
	

}
