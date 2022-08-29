package day0829;

import java.time.LocalDateTime;

public class Member_T1 {
	public static void main(String [] args) {
		
		
		Member member=new Member();
		member.memberNo = 1;
		member.email="pppjs@pppjs.com";
		member.name="박기태";
		member.phone="000-1111-2222";
		
		//static이 붙은 멤버는 클래스이름.XX으로 접근
		member.createdDate =LocalDateTime.now();

		System.out.println("회원번호 : "+member.memberNo);
		System.out.println("이메일 : "+member.email);
		System.out.println("이름 : "+member.name);
		System.out.println("전화번호 : "+member.phone);
		System.out.println("가입일 : "+member.createdDate);
		
		
		
		
	}

}
