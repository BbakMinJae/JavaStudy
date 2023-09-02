package j07_반복;

public class For3 {
	public static void main(String[] args) {
		/*
		 * String str = abcdefghijk
		 * 
		 * a
		 * b
		 * c
		 * d
		 * e
		 * f
		 * g
		 * h
		 * i
		 * j
		 * k
		 */
		String str = "abcdefghijk";
		
		System.out.println(str.length());
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(i, i + 1));
		}
		
		// 결합도는 낮추고 응집도는 높힌다.
	}
}
