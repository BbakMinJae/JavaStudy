package j06_조건;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		/*
		 * 승강장 3개
		 * platform1,2,3
		 * 
		 * 세 개의 승강장 층수를 입력으로 받고
		 * 제일 낮은 위치의 승강장 탑승
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int platform1 = 0;
		int platform2 = 0;
		int platform3 = 0;
		
		System.out.print("1승강장 위치 : ");
		platform1 = scanner.nextInt();
		
		System.out.print("2승강장 위치 : ");
		platform2 = scanner.nextInt();
		
		System.out.print("3승강장 위치 : ");
		platform3 = scanner.nextInt();
		
		if (platform1 < platform2 && platform1 < platform3)
			System.out.println("1승강장 탑승");
		else if (platform2 < platform1 && platform2 < platform3)
			System.out.println("2승강장 탑승");
		else 
			System.out.println("3승강장 탑승");
		
	}
}
