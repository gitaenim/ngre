package day0829;

import java.util.Scanner;

public class Circle {
	
	Point pos;//null로 초기화
	double r;
	Scanner in;
	
	//필드의 초기화 담당:생성자
	//이름(){} < 생성자
	
	Circle(){
		pos=new Point();
		r=0;
	}
	
	
}

//클래스를 구성하는 요소 > 멤버
//1.멤버필드
//2.멤버메소드
//3.생성자 : 필드의 초기화
//4.