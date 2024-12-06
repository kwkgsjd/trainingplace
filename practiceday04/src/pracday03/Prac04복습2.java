package pracday03;

import java.util.Scanner;

public class Prac04복습2 {
	public static void main(String[] args) {
		//중년 판정 (=중년, 40~59세)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하시오 : ");
		int adult = sc.nextInt();
		
		boolean old = adult >= 40 && adult <=59;
		System.out.println(old);
	}

}
