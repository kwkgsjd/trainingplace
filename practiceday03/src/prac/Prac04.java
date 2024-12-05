package prac;

public class Prac04 {

	public static void main(String[] args) {
		//int num = 42;
		//이숫자가 홀수인지 판정하여 출력
		//이숫자가 2의 배수인지 판정하여 출력
		//이 숫자에 4가 들어있는지 판정하여 출력
		
		int num = 42;
		
		boolean even = num%2 == 1;   //홀수인지 판정하려면 주어진 수에서 2로 나눌때 나머지가 0이면 짝수 아니면 홀수다
		System.out.println(even);
		
		boolean two = num%2 == 0;   //숫자가 2의배수일경우 2로 나누면 나머지가 0이 되어야한다
		System.out.println(two);
		
		boolean four = num%10 == 4 || num/10 == 4;
		System.out.println(four);

	}

}
