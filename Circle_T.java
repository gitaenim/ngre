package day0829;

public class Circle_T {
	public static void main(String[]args) {
		
		Circle c1=new Circle();
		//c1.pos = new Point();
		c1.r = 2.5;
		c1.pos.x=2;
		c1.pos.y=3;
		
		//[2,3]
		//c1.pos.x=10;
		//c1.pos.y=20;
		System.out.println(c1.r);
		System.out.println(c1.pos);
		System.out.print("pos [x,y]==["+c1.pos.x+",");
		System.out.println(c1.pos.y+"]");
		
	}

	
}
