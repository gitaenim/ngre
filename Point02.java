package day0829;

public class Point02 {
	
	//필드<=>인스턴스변수
	int x;	
	int y;
	
	
	public Point02(){
	//생성자 생성 = 정의	
		x=10;
	}
		
	public Point02(int x){
		this();
		this.x=x;
		
	
	}
	public Point02(String x){
		this.x=Integer.parseInt(x);
		y=20;
	}
	
	public Point02(int x, int y){
		this(x);//this 생성자는 첫줄에서만 허용됨
		this.y=y;
	}

}//Point02

//1.형태는 메소드와 비슷함.이름(파라미터){바디}
//2.이름이 클래스이름과 같음
//3.생성자를 여러개 정의할수 있음.
//생성자의 OverLoding
//오버로딩 : 매개변수를 달리하는 생성자를 여러개 선언하는것
//매개변수를 달리하는 생성자를 여러개 정의할수 있는것
//this 설계하는 단계에서 많이 사용