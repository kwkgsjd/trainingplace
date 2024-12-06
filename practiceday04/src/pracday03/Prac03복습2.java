package pracday03;

public class Prac03복습2 {
	public static void main(String[] args) {
		//만나이계산
		//12개월당 1살로 가정
		//1983년11월생의 만나이를 출력하시오
		//아저씨등록증발급 가능한 나이인지 출력(만45세이상)
		
		int y = 1983 , m = 11;
		int t = y * 12 + m;
		int now = 2024 * 12 + 12;
		
		int age = (now - t) / 12;
		System.out.println(age);
		
		boolean adult = age >= 45;
		System.out.println(adult);
		
	}

}
