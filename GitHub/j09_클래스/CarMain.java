package j09_클래스;

public class CarMain {
	public static void main(String[] args) {
		/*
		 * 실습 !
		 * Car
		 * 변수
		 * 		company
		 * 		model
		 * 		color
		 * 		km
		 * 
		 * 메소드
		 * 		showInfo - 변수 값들 다 보여주는 메소드
		 * 		colorChange - 1. 레드 2. 블루 3. 그린
		 * 		kmCheck - 출퇴근 -> 10 / 여행 -> 100
		 * 
		 * 
		 * 차 2대 만들기
		 * 현대자동차
		 * 쏘나타
		 * 화이트
		 * 30000
		 * 
		 * 기아
		 * k5
		 * 블랙
		 * 100000
		 */
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.company = "현대자동차";
		car1.model = "쏘나타";
		car1.color = "화이트";
		car1.km = 300000;
		
		car2.company = "기아";
		car2.model = "k5";
		car2.color = "블랙";
		car2.km = 100000;
		
		car1.showInfo();
		car2.showInfo();
		
		car1.colorChange(4);
		car1.kmCheck("여행");
		car1.showInfo();
	}
}
