package prac;

public class Prac03정수나눗셈2 {

	public static void main(String[] args) {
		//음료수가 1200원 핫바가 2300원입니다
		//현재 2+1 행사중입니다 (음료수,핫바 판매금액을 계산하는 무인 키오스크 구현
		//음료수 5잔의 값과 핫바 7개의 값 총합을 구하시오.
		
		int a = 1200;
		int aCount = 5;
		int b = 2300;
		int bCount = 7;
		
		int aFree = aCount / 3;
		int bFree = bCount / 3;
		int aPrice = aCount - aFree;
		int bPrice = bCount - bFree;
		
		int aTotalPrice = aPrice * a;
		int bTotalPrice = bPrice * b;
		
		int total = aTotalPrice + bTotalPrice;
		System.out.println(total);

	}

}
