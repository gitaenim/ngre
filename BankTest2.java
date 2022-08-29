package day0829;

import java.util.Calendar;

public class BankTest2 {

	public static void main(String[] args) {
			
		System.out.println("공통이자율"+Bank02.rate);
		
		Bank02 b1=new Bank02();
		b1.name="고객1";
		b1.money=100000;
		long interest =(long) (b1.money * Bank02.rate / 100);
		b1.money = (long) (b1.money + interest);
		System.out.println(b1.name+":"+b1.money);
		
		Bank02 b2=new Bank02(100000);
		b2.name ="고객2";
		interest =(long) (b2.money * Bank02.rate / 100);
		b2.money = (long) (b2.money + interest);
		System.out.println(b2.name+":"+b2.money);

		
		System.out.println("3개월후 이자 변경");
		Bank02.rate=3.5;
		
		
		interest =(long) (b1.money * Bank02.rate / 100);
		b1.money = (long) (b1.money + interest);
		System.out.println(b1.name+":"+b1.money);
		
		b2.name ="고객2";
		interest =(long) (b2.money * Bank02.rate / 100);
		b2.money = (long) (b2.money + interest);
		System.out.println(b2.name+":"+b2.money);
		
		System.out.println(Math.PI);
	
	}

}
