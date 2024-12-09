package pracday04;

import java.util.Scanner;

public class Prac04복습4일차수업1번째 {

	public static void main(String[] args) {
		//사용자에게 국,영,수 점수를 입력받아 구현하시오
		//각 과목이 30점 미만을 경우 불합격
		//평균이 52점 미만일 경우 불합격
		//위 두가지 경우가 아니면 합격
		//합격,불합격에 따라 다른 메세지가 나오도록 출력하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하시오 : ");
		int kor = sc.nextInt();
		System.out.println("영어점수를 입력하시오 : ");
		int eng = sc.nextInt();
		System.out.println("수학점수를 입력하시오 : ");
		int math = sc.nextInt();
		
		boolean korPass = kor >= 30;
		boolean engPass = eng >=30;
		boolean matPass = math >= 30;
		
		boolean averagePass = (kor + eng + math) >= 52;
		boolean allPass = averagePass && korPass && engPass && matPass;
		
		if(allPass) {
			System.out.println("합격입니다 ");
		}
		else {
			System.out.println("불합격입니다 ");
		}

	}

}
