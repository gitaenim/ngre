package day0829;

public class Bank {
	
	
	String name;
	double rate;
	long money;
	
	public Bank(long money,double rate) {
		this.money=money;
		this.rate=rate;
	}

	public Bank(double rate) {
		this.rate=rate;
		
	}
	

}
