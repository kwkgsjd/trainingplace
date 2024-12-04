package prac;

public class Prac02정수나눗셈 {

	public static void main(String[] args) {
		//2시간23분, 3시간59분의 시간 합을 구하시오.
		
		int h1 = 2;
		int m1 = 23;
		int h2 = 3;
		int m2 = 59;
		
		int h3 = h1 + h2;
		int m3 = m1 + m2;
		
		System.out.println(h3);
		System.out.println(m3);
		
		int h4 = h3 + m3 / 60;
		int m4 = m3 % 60;
		
		System.out.println(h4);
		System.out.println(m4);
		System.out.println(h4 + "시간" + m4 + "분" + "입니다.");
		
	}

}
