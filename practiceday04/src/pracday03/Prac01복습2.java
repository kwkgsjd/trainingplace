package pracday03;

public class Prac01복습2 {
	public static void main(String[] args) {
		//pc방 요금이 1시간에 1700원
		//09시25분에 들어와서 21시12분까지 이용한 손님의 계산금액을 구해서 출력
		//단 요금은 1분당으로 계산
		
		int h1 = 9 , m1 = 25;
		int h2 = 21 , m2 = 12;
		int price = 1700;
		
		int t1 = h1 * 60 + m1;   //이용시간 계산
		int t2 = h2 * 60 + m2;
		int uTime = t2 - t1;
		
		double mpp =  price / 60.0;
		
		int result = (int) (mpp * uTime);
		System.out.println(result);
	}

}
