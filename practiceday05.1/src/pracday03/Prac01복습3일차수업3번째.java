package pracday03;

public class Prac01복습3일차수업3번째 {
	public static void main(String[] args) {
		//pc방 요금이 1시간에 2000원
		//11시51분에 들어와서 20시15분까지 이용한 손님의 계산금액을 구해서 출력
		//단 요금은 1분당으로 계산
		
		int h1 = 11 , m1 = 51;
		int h2 = 20 , m2 = 15;
		int price = 2000;
		
		int t1 = h1 * 60 + m1;
		int t2 = h2 * 60 + m2;
		int t3 = t2 -t1;
		double mPrice = price / 60.0;   //100원아래는 털어야하므로 .0을 붙여야한다.   !!!!!!!!!!
		
		int pay = (int) (mPrice * t3);
		System.out.println(pay);
	}

}
