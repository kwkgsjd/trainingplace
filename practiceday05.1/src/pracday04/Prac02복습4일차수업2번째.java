package pracday04;

import java.util.Scanner;

public class Prac02복습4일차수업2번째 {
	public static void main(String[] args) {
		//신장과 체중을 입력받아 bmi계산 한 결과를 출력
		//bmi = 체중 / (신장 * 신장)
		//bmi 측정결과 저체중(<=16)인지 판정하여 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("본인의 체중을 입력하시오 : ");
		float kg = sc.nextFloat();
		System.out.println("본인의 키를 입력하시오 : ");
		float cm = sc.nextFloat();
		
		
		float m = cm / 100;
		float bmi = kg / (m * m);
		boolean under = bmi <= 16f;
		
		System.out.println("당신의 BMI 수치는 " + bmi);
		System.out.println("저체중입니다 : " + under);
		

	}

}
