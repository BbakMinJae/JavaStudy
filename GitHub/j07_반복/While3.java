package j07_반복;

import java.util.Scanner;

public class While3 {
	public static void main(String[] args) {
		
		/*
		 * 엘리베이터
		 * 
		 * 확인한 층 수 : 12
		 * 12
		 * 13
		 * 14
		 * 도착했습니다.
		 * 
		 * #2
		 * 확인한 층 수 : 4
		 * 4
		 * 3
		 * 2
		 * 1
		 * 도착했습니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int floor = 0;
		
		System.out.print("확인한 층수를 입력하시오 : ");
		floor = scanner.nextInt();
		
		int i = floor;
		
		while(i < 15) {
			System.out.println(i);
			i++;
		}
		System.out.println("꼭대기층에 도착했습니다.");
		
		int t = 0;
		while(t < floor) {
			System.out.println(floor - t);
			t++;
		}
		
	}
}
