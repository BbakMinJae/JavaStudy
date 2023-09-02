package j08_메소드;

public class Method1 {

	public static void main(String[] args) {
		
		int num1 = 15;
		int num2 = 20;
		
		int sum = add(num1, num2); // 던져주는 값 : 인수
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}
	
	public static int add(int n1, int n2) { // 받는 값 : 매개변수
		int result = n1 + n2;
		return result;
	}

}
