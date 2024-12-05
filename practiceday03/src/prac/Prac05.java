package prac;

public class Prac05 {

	public static void main(String[] args) {
		//1.건강검진은 한국나이 22세 이상인 사람들을 대상으로 2년마다 진행한다
		//2.짝수년도에 출생한 사람은 홀수해에
		//3.홀수년도에 출생한 사람은 짝수해에
		//2001년생이 건강검진대상자인지 판정하여출력
		
		//입력
		int birth = 2001;
		
		//풀이
		int year = 2024;
		int age = year - birth + 1;
		
		boolean over22 = age >= 22;   //22세이상이 되어야 가능하기때문에 먼저 1번
		boolean even = birth%2 == 0 || year%2 ==1;   //짝수 판별   //짝수년출생은 홀수년에
		boolean odd = birth%2 == 1 || year%2 ==0;   //홀수 판별   //홀수년출생은 짝수년에
		
		boolean healthCare = over22 && (even|| odd);   //건강검진은 22살이상에다가 (2번부합 or 3번부합)이 되야 성립
		System.out.println(healthCare);
	

	}

}
