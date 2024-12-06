package pracday04;

import java.util.Scanner;

public class Prac02복습1 {
	public static void main(String[] args) {
		//신장과 체중을 입력받아 bmi계산 한 결과를 출력
		//bmi = 체중 / (신장 * 신장)
		//bmi 측정결과 저체중(<=16)인지 판정하여 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("신장(cm) 입력 : ");
		float cm = sc.nextFloat();
		System.out.println("체중(kg) 입력 : ");
		float kg = sc.nextFloat();
		
		float m = cm / 100;
		float bmi = kg / (m * m);
		boolean down = bmi <= 16f;
		
		System.out.println("당신의 BMI 수치는 " + bmi);
		System.out.println("저체중입니다 : " + down);
		
	}

}
