package prac;

public class Prac03 {

	public static void main(String[] args) {
		//12개월 당 1살로 가정한다
		//2013년 11월생의 만나이를 구하여 출력
		//주민등록증 발급이 가능한 나이인지 판정하여 출력
		
		int y = 2013 , m = 11;
		
		int tm = y * 12 + m;   //주인공의 생년월에서 월로 만들기
		int now = 2024 * 12 + 12;   //현재 년월을 월로 만들기
		
		int gap = now - tm;   //현재월의 합에서 주인공의 월의 합을 구함
		int age = gap/12;   //주인공의 나이계산 지금까지 살아온 월수에서 12개월을 나눔
		
		boolean result = age >= 18;   //주민등록증은 만18세부터 나오므로 18세보다 크거나 같아야됨
		System.out.println(result);
		
	
		
		

	}

}
