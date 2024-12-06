package pracday03;

public class Prac05복습3일차수업3번째 {
	public static void main(String[] args) {
		//주어진 정수에서 문제의 요구사항에 부합하는지 판정후 출력
		//1. 8의배수입니까?
		//2. 홀수입니까?
		//3. 주어진 정수에 4가 들어갑니까?
		
		int num = 81;
		
		boolean eight = num%8 ==0;
		System.out.println(eight);
		boolean odd = num%2 == 1;
		System.out.println(odd);
		boolean four = num/10 ==4 && num%10 ==4;
		System.out.println(four);

	}

}
