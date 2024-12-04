package prac;

public class Prac04실수계산기 {

	public static void main(String[] args) {
		//학생의 점수 총합과 과목의 평균을 구하시오
		//국어 78점 수학 69점 과학 98점 사회 46점
		
		int a = 78;
		int b = 69;
		int c = 98;
		int d = 46;
		
		int totalScore = a + b + c + d;
		float average = (float)totalScore / 4;
		
		System.out.println(totalScore);
		System.out.println(average);

	}

}
