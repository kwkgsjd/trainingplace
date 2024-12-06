package pracday03;

public class Prac02복습2 {
	public static void main(String[] args) {
		//1978년생이 편의점에서 소주를 사러왔다
		//1.판매가 가능한지 판정하여 출력
		//2.한국나이로 40세이상만 소주를 구매할수있다
		
		int birth = 1978;
		int year = 2024;
		
		int age = year - birth - 1;
		boolean adult = age >= 40;
		
		System.out.println(adult);
	}

}
