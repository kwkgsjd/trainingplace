package pracday04;

import java.util.Scanner;

public class Prac06복습4일차수업1번째 {

	public static void main(String[] args) {
		//여행상품 판매
		//장소 무관 1인당 1일에 15만원
		//계절에 따라 추가 할인도 존재
		//봄(3~5월) - 40%할인
		//여름(6~8월) - 25%할인
		//가을(9~11월) - 15%할인
		//겨울(12~2월) = 50% 할인
		
		Scanner sc = new Scanner(System.in);
		System.out.print("여행 갈 인원 수를 입력하시오 : ");
		int people = sc.nextInt();
		System.out.print("여행갈 기간을 입력하시오 : ");
		int days = sc.nextInt();
		System.out.print("몇 월에 가시는지 입력하시오 : ");
		int month = sc.nextInt();
		
		int price = people * days * 150000;
		
		int rate;
		if(month == 3 && month == 4 && month == 5) {
			rate = 40;
		}
		else if(month == 6 && month == 7 && month == 8) {
			rate = 25;
		}
		else if(month == 9 && month == 10 && month ==11) {
			rate = 15;
		}
		else {
			rate = 50;
		}
		double discount = price * rate/100f;
		double total =price - discount;
		
		System.out.println("예상 경비 : " + price + "원");
		System.out.println("할인율 : " + rate + "%");
		System.out.println("할인 금액 : " + discount + "원");
		System.out.println("최종 경비 : " + total + "원");

	}
}
