package j07_반복;

import java.util.Scanner;

public class Paging {
	public static void main(String[] args) {
		
		/*
		 * 총 게시물 수 : 85
		 * 한 페이지에 들어갈 게시글 수 : 10
		 * 
		 * 총 페이지 수 : 9
		 * 1페이지
		 *  85
		 *  84
		 *  83
		 *  ...
		 *  76
		 *  2페이지
		 *   75
		 *   74
		 *   ...
		 *   66
		 *  ...
		 *  9페이지
		 *   5
		 *   4
		 *   3
		 *   2
		 *   1
		 *  
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int totalNotice = 0;
		int pageNum = 0;
		int totalPage = 0;

		System.out.print("총 게시물 수 : ");
		totalNotice = scanner.nextInt();
		
		System.out.print("한 페이지에 들어갈 게시글 수 : ");
		pageNum = scanner.nextInt();
		
		totalPage = totalNotice % pageNum == 0 ? totalNotice / pageNum
												: totalNotice / pageNum + 1;
		
		for(int i = 0; i < totalPage; i++) {
			System.out.println((i + 1) + "page");
			
			for(int j = 0; j < pageNum; j++) {
				if(totalNotice == 0) {
					continue;
				}
				System.out.println(totalNotice--);
			}
		}
		
		// 내가 한 풀이
//		if (totalNotice % pageNum == 0) totalPage = totalNotice / pageNum;
//		else totalPage = totalNotice / pageNum + 1;
//		
//		System.out.println("총 페이지 수 : " + totalPage);
//		
//		for (int i = 1; i <= totalPage;  i++) {
//			System.out.println(i + "페이지");
//			for (int j = totalNotice; j > totalNotice - 10; j--) {
//				if (j == 0) break;
//				System.out.println(j);
//				
//				
//			}
//			totalNotice -= 10;
//		}
	}
}
