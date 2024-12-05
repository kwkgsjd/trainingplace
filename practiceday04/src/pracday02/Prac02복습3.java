package pracday02;

public class Prac02복습3 {
	public static void main(String[] args) {
		//4시간23분, 7시간53분의 시간 합을 구하시오.
		
		int h1 = 4, m1 = 23;
		int h2 = 7, m2 = 53;
		
		int t1 = (h1 + h2) * 60;
		int t2 = m1 + m2;
		
		int totalM = t1 + t2;
		int h = totalM/60;
		int m = totalM%60;
		
		System.out.println(h);
		System.out.println(m);
	}

}
