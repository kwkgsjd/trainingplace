package pracday03;

public class Prac06복습2 {
	public static void main(String[] args) {
		//건강검짐은 한국나이 47세이상인 사람들이 받는 검진입니다.
		//짝수년도에 출생한 사람은 짝수년에 받을수있습니다
		//홀수년도에 출생한 사람은 홀수년에 받을수있습니다
		//1971년생이 검강검진 대상자인지 판정하여 출력하시오
		
		int birth = 1971;
		int now = 2024;
		int age = now - birth + 1;
		
		boolean over47 = age >=47;
		boolean even = birth%2 == 0 && now%2 == 0;
		boolean odd = birth%2 ==1 && now%2 ==1;
		
		boolean healthCare = over47 && (even || odd);
		
		System.out.println(age);
		System.out.println(healthCare);
		
		
		
		
	}

}
