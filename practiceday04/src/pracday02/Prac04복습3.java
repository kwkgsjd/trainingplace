package pracday02;

public class Prac04복습3 {
	public static void main(String[] args) {
		//학생의 점수 총합과 과목의 평균을 구하시오
		//국어 23점 수학 59점 과학 81점 영어 33점 사회 97점
		
		int korea = 23;
		int math = 59;
		int science = 81;
		int english = 33;
		int social = 97;
		
		int total = korea + math + science + english + social;
		float average = (float)total/5;
		
		System.out.println(total);
		System.out.println(average);
		
		
	}

}
