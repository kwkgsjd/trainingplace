package pracday02;

public class Prac03복습3 {
	public static void main(String[] args) {
		//소주가 3500원 맥주가 4500원입니다
		//현재 2+1 행사중입니다 (무인키오스크로 구현)
		//소주 12병의 값과 맥주 23병의 값 총합을 구하시오
		
		int aPrice = 3500; 
		int aCount = 12; 
		int bPrice = 4500;
		int bCount = 23;
				
		int free1 = aCount/3;
		int free2 = bCount/3;
		int pay1 = aCount - free1;
		int pay2 = bCount - free2;
		
		int total1 = pay1 * aPrice;
		int total2 = pay2 * bPrice;
		
		int result = total1 + total2;
		
		System.out.println(result);
		
		
		
	}

}
