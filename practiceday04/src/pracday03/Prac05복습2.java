package pracday03;

public class Prac05복습2 {
	public static void main(String[] args) {
		//주어진 정수에서 문제의 요구사항에 부합하는지 판정후 출력
		// num = 94
		//1. 5의배수입니까?
		//2. 홀수입니까?
		//3. 주어진 정수에 9가 들어갑니까?

		int num = 94;
		
		boolean five = num%5 == 0;
		System.out.println(five);
		boolean odd = num%2 ==1;
		System.out.println(odd);
		boolean nine = num/10 == 9 || num%10 ==9;
		System.out.println(nine);
	}

}
