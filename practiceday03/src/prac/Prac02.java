package prac;

public class Prac02 {

	public static void main(String[] args) {
		//2004년생이 편의점에 맥주를 사러왔다
		//판매가 가능한지 판정하여 출력하여라
		
		int birth = 2004;
		int year = 2024;
		int age = year - birth + 1;
		
		boolean result = age >= 20;
		System.out.println(result);
	

	}

}
