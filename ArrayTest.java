package day0829;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] exam=new int[3+1];
		double avg;
		String name;
		
		name="박기태";
		exam[0]=100;
		exam[1]=80;
		exam[2]=60;
		exam[3]=exam[0]+exam[1]+exam[2];
		avg=exam[3]/3.0;
		
		
		Exam ex=new Exam();
		ex.name="박기태";
		ex.kor=100;
		ex.eng=80;
		ex.mat=60;
		ex.tot=ex.kor+ex.eng+ex.mat;
		ex.avg=ex.tot/3.0;
		
		System.out.println("이름 : "+ex.name);
		System.out.println("국어 : "+ex.kor);
		System.out.println("영어 : "+ex.eng);
		System.out.println("수학 : "+ex.mat);
		System.out.println("총점 : "+ex.tot);
		System.out.println("평균 : "+ex.avg);
		
		ex.prian();
		ex.eng=100;
		ex.total();
		ex.prian();

	}

}
