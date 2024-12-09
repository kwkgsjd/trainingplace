package pracday04;

import java.util.Scanner;

public class Prac05복습4일차수업1번째 {

	public static void main(String[] args) {
		//지하철요금은 다음과 같습니다
		//성인 2000원(20~64세)
		//청소년 1200원(14~19세)
		//어린이 800원(8세~13세)
		//어르신 및 영유아 300원
		//일회용 카드발급기를 사용할 경우 카드 보증금 500원이 모두에게 추가됨
		
		Scanner sc = new Scanner(System.in);
		System.out.print("생년 4자리를 입력하시오 : ");
		int birth = sc.nextInt();
		
		int card = 500;
		int adult = 2000 , teen = 1200 , child = 800, free = 0;
		
		int age = 2024 - birth + 1;
		
		if(20<=age && 64>=age) {
			int price = adult + card;
			System.out.println(age + "살입니다 요금은 " + price + "원입니다");
		}
		else if(14>=age && 19<=age) {
			int price = teen + card;
			System.out.println(age + "살입니다 요금은" + price + "원입니다");
		}
		else if(8<=age && 13>=age) {
			int price = child + card;
			System.out.println(age + "살입니다 요금은" + price + "원입니다");
		}
		else {
			int price = free + card;
			System.out.println(age + "살입니다 요금은" + price + "원입니다");
		}
		

	}

}
