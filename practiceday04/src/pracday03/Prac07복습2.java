package pracday03;

import java.util.Scanner;

public class Prac07복습2 {
	public static void main(String[] args) {
		//사람이름 김돌비
		//국어점수 74점, 수학점수 64점, 영어점수 49점 ,사회점수 23점, 과학점수 88점
		//김돌비님의 과목 총점은 --점입니다.
		//김돌비님의 과목 평균은 --점입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("본인의 섬함을 작성하시오 : ");
		String name = sc.next();
		
		System.out.print("국어점수를 입력하시오 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수를 입력하시오 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수를 입력하시오 : ");
		int eng = sc.nextInt();
		
		System.out.print("사회점수를 입력하시오 : ");
		int social = sc.nextInt();
		
		System.out.print("과학점수를 입력하시오 : ");
		int science = sc.nextInt();
		
		int totalScore = kor + math + eng + social + science;
		float average = (float)totalScore / 5;
		
		System.out.println("당신의 총점은 : " + totalScore + "점 입니다 ");
		System.out.println("당신의 평균은 : " + average + "점 입니다 ");
		
		
	}

}
