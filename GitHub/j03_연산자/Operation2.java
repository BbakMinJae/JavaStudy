package j03_연산자;

public class Operation2 {
	public static void main(String[] args) {
		
		//관계연산자
		System.out.println(10 > 5);
		boolean flag = 10 > 5;
		System.out.println(flag);
		
		int num = 7;
		
		boolean result = num < 7;
		System.out.println(result);
		
		boolean result2 = num != 7;
		System.out.println(result2);
		
		boolean result3 = num == 10;
		System.out.println(result3);
		
		/*
		 * 논리연산
		 * : boolean 
		 * 
		 * AND연산(&&) - 곱
		 * true && true -> true
		 * true && false -> false
		 * false && false -> false
		 * 
		 * OR연산(||) - 합
		 * true || true -> true
		 * true || false -> true
		 * flase || false -> false 
		 * 
		 * NOT연산(!) - 부정
		 * !true -> false
		 * !false -> true
		 * 
		 * !(true && false) -> 
		 */
	}
}
