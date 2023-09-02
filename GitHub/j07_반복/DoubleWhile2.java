package j07_반복;

import java.util.Scanner;

public class DoubleWhile2 {
	public static void main(String[] args) {
		
		/*
		 * 수업 시작 시간 : 7
		 * 7시
		 * 			1분
		 * 			2분
		 * 			3분
		 * 			...
		 * 			50분
		 * 			쉬는시간
		 * 			1분
		 * 			2분
		 * 			...
		 * 			10분
		 * 8시
		 * 			1분
		 * 			...
		 * 			50분
		 * 			쉬는시간
		 * 			...
		 * 			10분
		 * 9시
		 * 			...
		 * 
		 * 수업 끝!
		 */
		
		Scanner scanner = new Scanner(System.in);
		int time = 0;
		
		System.out.print("수업 시작 시간 : ");
		time = scanner.nextInt();
		
		
//		while(time < time + 2) {
//			System.out.println(time + "시");
//			while(i < 50) {
//				System.out.println("\t" + (i + 1) + "분");
//				i++;
//			}
//			while(j < 10) {
//				System.out.println("쉬는시간");
//				System.out.println("\t" + (j + 1) + "분");
//				j++;
//			}
//			time++;
//		}
//		System.out.println("수업 끝!");
		
		int i = 0;
		while(i < 3) {
			System.out.println((time + i) + "시");
			
			int j = 0;
			while(j < 60)  {
				int num = j + 1;
				if(j < 50) {
					System.out.println("\t" + num + "분");
				}else {
					if (j == 50) {
						System.out.println("\t10분 쉬는 시간");
					}
					System.out.println("\t" + (num - 50) + "분");
				}
				j++;
			}
			i++;
		}
	}
}
