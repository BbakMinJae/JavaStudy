package j04_문자열;

public class String4 {
	public static void main(String[] args) {
		String userinfo = "홍길동-010/1234/5678-18, 가나다-010/1111/2222-24, 심청이-010/9999/8888";
		
		/*
		 * 홍길동_010-1234-5678_18/가나다_010-1111-2222_24/심청이_010-9999-8888
		 */
		
		String reUserinfo3 = userinfo.replaceAll("-",  "_")
									.replaceAll("/", "-")
									.replaceAll(", ", "/");
		System.out.println(reUserinfo3);
		
	}
}