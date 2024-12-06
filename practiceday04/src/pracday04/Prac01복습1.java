package pracday04;

import java.util.Scanner;

public class Prac01복습1 {
	public static void main(String[] args) {
		//사용자에게 8자리 숫자형태로 생년월일을 입력받습니다
		//입력받은 내용을 토대로 한국나이와 만나이를 계산하여 각각 출력
		//한국나이 : 연도만으로 계산하며 태어나면 1살
		//만나이 : 연도와 월로 계산하며 12개월 당 1살
		
		int birth = 20000410;
		
		int year = birth / 10000;
		int month = birth % 10000 / 100;
		System.out.println(month);
		
		int koreaAge = 2024 - year + 1;
		
		int nowMonth = 2024 * 12 + 12;
		int born = year * 12 + month;
		int diff = nowMonth - born;
		
		int amercianAge = diff / 12;
		
		System.out.println("당신의 한국나이는 " + koreaAge + "세");
		System.out.println("당신의 만나이는 " + amercianAge + "세");
		System.out.println("(" + diff/12+ "년" + diff%12 + "개월)");
		
		
		
		
	}

}
