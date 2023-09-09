package j09_클래스;

public class Car {
	String company;
	String model;
	String color;
	int km;
	
	public Car() {
		System.out.println("생성자 호출");
	}
	/*
	 * 기본생성자의 특징
	 * 1. 생성자는 무조건 클래스명과 동일하다.
	 * 2. 생성자는 무조건 주소값을 리턴한다.
	 */
	
	void showInfo() {
		System.out.println("제조사 : " + company);
		System.out.println("차종 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("주행거리 : " + km);
		System.out.println();
	}
	
	void colorChange(int num) {
		switch(num) {
		case 1 : color = "레드"; break;
		case 2 : color = "블루"; break;
		case 3 : color = "그린"; break;
		default : break;
		}
	}
	
	void kmCheck(String str) {
		if(str.equals("출퇴근")) {
			km += 10;
		} else if(str.equals("여행")) {
			km += 100;
		} else return;
	}

}

