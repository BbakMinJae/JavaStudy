package j07_반복.랜덤;

public class Random1 {

	public static void main(String[] args) {
		
//		System.out.println(Math.random());
		
		int i = 0;
		
		while(i < 10) {
			double rNum = Math.random();
			System.out.println((int)(rNum * 1000));
			i++;
		}
		
		/*
		 * 235
		 * 885
		 * 660
		 * 514
		 * ...
		 */
		
	}
}
