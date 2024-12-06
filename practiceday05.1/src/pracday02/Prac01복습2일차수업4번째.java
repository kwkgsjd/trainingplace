package pracday02;

public class Prac01복습2일차수업4번째 {
	public static void main(String[] args) {
		//소주가 3100원 맥주가 4300원입니다
		//현재 2+1 행사중입니다 (무인키오스크로 구현)
		//소주 114병의 값과 맥주 274병의 값 총합을 구하시오
		
		int a = 3100;
		int b = 4300;
		int aCount = 114;
		int bCount = 274;
		
		int free1 = aCount/3;
		int free2 = bCount/3;
		int pay1 = a * (aCount - free1);
		int pay2 = b * (bCount - free2);
		
		int total = pay1 + pay2;
		System.out.println(total);

	}

}
