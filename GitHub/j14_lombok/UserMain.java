package j14_lombok;

import java.util.Scanner;

public class UserMain {
	/*
	 * 실습!
	 * userId
	 * userPW
	 * userName
	 * userAge
	 * userEmail
	 * 
	 * 아이디를 입력하시오
	 * gildong
	 * 비밀번호를 입력하시오
	 * 1234
	 * 이름을 입력하시오
	 * 홍길동
	 * 나이를 입력하시오
	 * 18
	 * 이메일을 입력하시오
	 * userEmail
	 * 
	 * 홍길동(gildong)님 회원가입을 축하합니다.
	 * 
	 * 내정보 확인
	 * 입력값 다 나오게 하기
	 * 
	 */

	public static void main(String[] args) {
		
		String userId;
		String userPW;
		String userName;
		int userAge;
		String userEmail;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디를 입력하시오");
		userId = scanner.next();
		
		System.out.println("비밀번호를 입력하시오");
		userPW = scanner.next();

		System.out.println("이름을 입력하시오");
		userName = scanner.next();

		System.out.println("나이를 입력하시오");
		userAge = scanner.nextInt();
		
		System.out.println("이메일을 입력하시오");
		userEmail = scanner.next();
		
		User user = User.builder()
				.userId(userId)
				.userPW(userPW)
				.userName(userName)
				.userAge(userAge)
				.userEmail(userEmail)
				.build();
		
		System.out.println(user.getUserName() + "(" + user.getUserId() + ")" + "님 회원가입을 축하합니다.");
		
		System.out.println();
		System.out.println(user);
		
		
		
	}
}
