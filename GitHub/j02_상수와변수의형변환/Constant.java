package j02_상수와변수의형변환;

public class Constant {
	public static void main(String[] args) {
		
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 0;
		/*
		 * 상수
		 * : 변하지 않는 수
		 * 
		 * 변수명 표기 -> 모두 대문자로 표기 -> 카멜이 적용이 안됨.
		 * -> 그래서 스네이크 표기법으로 작성
		 * 
		 * 상수는 무조건 선언과 초기화를 같이 해줘야 함!!!
		 */
		int number = 80;
		number = 50;
		
		System.out.println("최댓값 : " + MAX_NUMBER);
		System.out.println("최솟값 : " + MIN_NUMBER);
		System.out.println("현재값 : " + number);
	}
}
