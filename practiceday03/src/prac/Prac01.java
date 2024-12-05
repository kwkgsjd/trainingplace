package prac;

public class Prac01 {

	public static void main(String[] args) {
		//pc방 요금이 한시간에 2200원입니다
		//11시20분에 들어와서 16시10분까지 이용한 손님의 계산금액을 구하시오
		//요금은 1분당으로 계산
		//추가 - 100원미만의 금액은 받지않는다

		
		
		int price = 2200;
		int h1 = 11 ,  m1 = 20;
		int h2 = 16 , m2 = 10;
		
		int h3 = h2 - h1;
		int m3 = m2 - m1;
		int totalM = h3*60 + m3;
		
		double mPrice = price/60.0;
		int ttp = (int) (totalM * mPrice);
		System.out.println(ttp);
		
		int result = ttp/100 * 100;
		System.out.println(result);
		
		

	}

}
