package pracday03;

public class Prac02복습3일차수업3번째 {
	public static void main(String[] args) {
		//1974년생이 편의점에서 소주를 사러왔다
		//1.판매가 가능한지 판정하여 출력
		//2.한국나이로 43세이상만 소주를 구매할수있다
		
		int birth = 1974;
		int current = 2024;
		int age = current - birth + 1;
		
		boolean buy = age>=43;
		System.out.println(buy);
		
		

	}

}
