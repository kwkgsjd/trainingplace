package pracday04;

public class Prac01복습4일차수업2번째 {
	public static void main(String[] args) {
		//사용자에게 8자리 숫자형태로 생년월일을 입력받습니다
		//입력받은 내용을 토대로 한국나이와 만나이를 계산하여 각각 출력
		//한국나이 : 연도만으로 계산하며 태어나면 1살
		//만나이 : 연도와 월로 계산하며 12개월 당 1살
		
		int birth = 20000410;
		int year = birth/10000 , month = birth%10000 / 100;
		
		int koreaAge = 2024 - year + 1;
		
		int current = 2024*12 + 12;   //현재 년도의 총 개월수 계산
		int born = year*12 + month;   //주인공이 태어난 개월수 계산
		int diff = current - born;   //개월수 주인공이 살아온 총 개월수
		
		int amercianAge = diff / 12;   //만나이 구하기
		
		
		
		System.out.println("당신의 한국나이는 " + koreaAge + "세");
		System.out.println("당신의 만나이는 " + amercianAge + "세");
		System.out.println("(" + diff/12+ "년" + diff%12 + "개월)");

	}

}
