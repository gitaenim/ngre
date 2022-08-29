package day0829;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day0014_t1 {
	public static void main(String[] args) {

		Day0014 week = Day0014.MON;
		int no = 1;

		// for(int i =0;i<;i++) {}

		System.out.println(week);
		// 기본적으로 2가지의 표현식을 사용가능
		// 숫자표현,문자표현
		System.out.println(week.name());// 문자열표현식★
		System.out.println(week.ordinal());// 숫자열표현식

		for (Day0014 w : Day0014.values()) {
			System.out.println(w);
		}

		Date date = new Date();
		System.out.println(date);

		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		// 1.8
		LocalDateTime dateTime;
		// Enum.class

		int wk = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(wk);// 일 : 1 , 월 : 2~~~~~

		switch (wk) {
		case 1:week = Day0014.SUN;break;
		case 2:week = Day0014.MON;break;
		case 3:week = Day0014.TUE;break;
		case 4:week = Day0014.WED;break;
		case 5:week = Day0014.THU;break;
		case 6:week = Day0014.FRI;break;
		case 7:week = Day0014.SUN;break;
		}
		
		System.out.println("요일 : "+ week.dow);

		// Enum.class를 통해 열거형 관리
	}

}
