package pracday03;

public class Prac06복습3일차수업3번째 {
	public static void main(String[] args) {
		//건강검짐은 한국나이 44세이상인 사람들이 받는 검진입니다.
		//짝수년도에 출생한 사람은 짝수년에 받을수있습니다
		//홀수년도에 출생한 사람은 홀수년에 받을수있습니다
		//1973년생이 검강검진 대상자인지 판정하여 출력하시오
		
		int born = 1973;
		int current = 2024;
		int age = current - born + 1;
		
		boolean even = born%2 ==0 && current%2==0;
		boolean odd = born%2 ==1 && current%2 ==1;
		boolean healthCare = age >= 44 && (even||odd);
		
		System.out.println(healthCare);
		
		

	}

}
