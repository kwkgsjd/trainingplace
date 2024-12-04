package prac;

public class Prac01정수 {

	public static void main(String[] args) {
		//김밥하나에 2000원, 라면한그릇에 4000원, 돈까스하나에 9800원입니다.
		//김밥 4줄에 라면 12그릇 돈까스 17개의 총합을 구하시오.
		
		int a = 2000;
		int b = 4000;
		int c = 9800;
		int aCount = 4;
		int bCount = 12;
		int cCount = 17;
		
		int aTotal = a * aCount;
		int bTotal = b * bCount;
		int cTotal = c * cCount;
		
		int totalPrice = aTotal + bTotal + cTotal;
		
		System.out.println(totalPrice);

	}

}
