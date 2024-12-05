package pracday02;

public class Prac01복습3 {
	public static void main(String[] args) {
		//소고기 한근에 67510원, 돼지고기 한근에 23450원 , 닭고기 한근에 14280원입니다
		//소고기 12근, 돼지고기 7근, 닭고기 21근의 총합을 구하시오
		
		int a = 67510;
		int b = 23450;
		int c = 14280;
		
		int aCount = 12;
		int bCount = 7;
		int cCount = 21;
		
		int result = a * aCount + b * bCount  + c * cCount ;
		System.out.println(result);
	}

}
