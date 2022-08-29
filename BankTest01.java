package day0829;

public class BankTest01 {

	public static void main(String[] args) {

		Bank b1 = new Bank(100000, 2.5);
		b1.name = "XXX";

		Bank b2 = new Bank(2.5);
		b2.name = "YYY";
		b2.money = 100000;
		// 이자 적용 =>
		double interest = b1.money * b1.rate / 100;
		b1.money = (long) (b1.money + interest);

		System.out.println(b1.name + ":" + b1.money);
		//////////////////////////////////////////
		interest = b2.money * b2.rate / 100;
		b2.money = (long) (b2.money + interest);

		System.out.println(b2.name + ":" + b2.money);
		//////////////////////////////////////////
		System.out.println("3개월후");
		b1.rate = 3.5;
		interest = b1.money * b1.rate / 100;
		b1.money = (long) (b1.money + interest);
		
		System.out.println(b1.name + ":" + b1.money);
		/////////////////////////////////////////
		//b2.rate=2.5;
		interest = b2.money * b2.rate / 100;
		b1.money = (long) (b2.money + interest);
		
		System.out.println(b2.name + ":" + b2.money);
	}

}
