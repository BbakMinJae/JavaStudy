package j01_출력;

public class Myinfo2 {
	public static void main(String[] args) {
		boolean flag;
		flag = true;
		flag = false;
		
		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';
		
		System.out.print(name1);
		System.out.print(name2);
		System.out.print(name3);
		System.out.println();
		
		System.out.println(name1 + name2 + name3);
		System.out.println("" + name1 + name2 + name3); // 앞에서 ""를 붙임으로써 문자열로 인식
		
		
	}
}
