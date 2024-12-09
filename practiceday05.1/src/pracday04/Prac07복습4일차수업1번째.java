package pracday04;

public class Prac07복습4일차수업1번째 {

	public static void main(String[] args) {
		//주차요금계산기를 구현하시오
		//최초 30분은 무료
		//31분부터는 10분당 500원 부과 (31분 주차했으면? 1500원)
		//일 최대 요금은 30000원
		//사용자에게 들어온시간과 나간시간을 4자리 정수로 각각입력받아서 
		//주차시간과 주차요금을 구하여 출력
		
		int in = 1150;
		int out = 1250;
		
		int inHour = in/100, inMinute = in%100;
		int outHour= out/100, outMinute = out%100;
		int inTime = inHour * 60 + inMinute;
		int outTime = outHour * 60 + outMinute;
		
		int useTime = outTime - inTime;
		int hour = useTime / 60 , minute =  useTime % 60;
		
		int price = useTime / 10 * 500;
				
		System.out.println("주차시간 총 " + hour + "시간" + minute + "분");
		if(useTime <= 30) {
		System.out.println("30분 이하 주차(회차)");
		}
		else if(price > 30000) {
		System.out.println("주차요금 10000원 입니다");
		}
		else {
		System.out.println("주차요금 " + price + "원 입니다");
		

	}

	}
	
}
