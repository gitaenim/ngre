package day0829;

public class Exam {
	
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	
	//매소드로 기능제작
	void total() {
		tot=kor+eng+mat;
		avg=tot/3.0;
	}
	void prian() {
		System.out.println("---회원정보---");
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+mat);
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
		System.out.println("------------");
	}
	

}
