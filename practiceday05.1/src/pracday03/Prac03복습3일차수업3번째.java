package pracday03;

public class Prac03복습3일차수업3번째 {
	public static void main(String[] args) {
		//만나이계산
		//12개월당 1살로 가정
		//1983년11월생의 만나이를 출력하시오
		//성인등록증발급 가능한 나이인지 출력(만40세이상)
		
		int y1 = 1983 , m1 = 11;
		int y2 = 2024 , m2 = 12;
		
		int m3 = y1 * 12 + m1;
		int m4 = y2 * 12 + m2;
		
		int month = m4 - m3;
		int koreaAge = month/12;
		boolean adult = koreaAge >= 40;
		
		System.out.println(adult);
		

	}

}
