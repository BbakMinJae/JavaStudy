package j05_입력;

import java.util.Scanner;

public class Input2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String address = null;
		
		System.out.print("현재 주소를 입력하시오 : ");
		address = scanner.nextLine();
		
		System.out.println("주소 : " + address);
	}
}
