package pracday04;

import java.util.Scanner;

public class Prac03복습4일차수업1번째 {

	public static void main(String[] args) {
		//우리 수업은 10시31분부터 지각으로 처리됩니다
		//카드를 태그한 시각에 대한 정보를 입력바다아 정상출석인지 지각인지 판정하여 출력하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입실한 시간을 입력하시오 : ");
		int time = sc.nextInt();
		
		int deadline = 1030;
		
		//- 시간과 분을 분할한다음 분으로 합쳐서 비교
		int h1 = time / 100;
		int m1 = time % 100;
		int h2 = deadline / 100;
		int m2 = deadline % 100;
		
		int t1 = h1 * 60 + m1;   //출석한 시간을 분으로 바꿈
		int t2 = h2 * 60 + m2;   //정상출석 마지노선을 분으로 바꿈
		
		boolean ok = t1 <= t2;   //정상출석인지 확인 출석한 시각 <= 정상출석 마지노선 시각
		
		//출력
		if(ok){
		System.out.println("정상 출석입니다");
		}
		else {
		System.out.println("지각입니다");
		}
		
		
		
		

	}

}
