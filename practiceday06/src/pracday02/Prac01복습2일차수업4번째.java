package pracday02;

public class Prac01복습2일차수업4번째 {
	public static void main(String[] args) {
		//소주가 3100원 맥주가 4300원입니다
		//현재 2+1 행사중입니다 (무인키오스크로 구현)
		//소주 114병의 값과 맥주 274병의 값 총합을 구하시오
		
		int a = 3100, b = 4300;
		int aCount = 114 , bCount = 274;
		int afree = aCount/3;
		int bfree = bCount/3;
		
		int afull = aCount - afree;
		int bfull = bCount - bfree;
		
		int apay = a * afull;
		int bpay = b * bfull;
		
		int total = apay + bpay;
		System.out.println(total);
		
	}

}
