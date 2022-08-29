package day0829;

public class ConstructorsTest {

	public static void main(String[] args) {

		Point02 p2=new Point02();
		
		//System.out.println(p2.x);10
		//System.out.println(p2.y);0
		
		p2=new Point02(10);//인자,Arguement
		
		System.out.println(p2.x);
		System.out.println(p2.y);
		
		p2=new Point02(100,200);
		
		System.out.println(p2.x);
		System.out.println(p2.y);
		
		//p2=new Point02(10L);//인자,Arguement
		//undefined=>define
		
		
	}

}
