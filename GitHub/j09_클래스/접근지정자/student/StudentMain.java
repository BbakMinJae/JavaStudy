package j09_클래스.접근지정자.student;

public class StudentMain {
	/*
	 * Student 생성하고 name에 홍길동 값 주입
	 * 
	 * 전체생성자 만들기
	 * 홍길동 / 3 / 18 / 부산 동래구 / 010-1234-5678
	 */
	public static void main(String[] args) {
		Student student = new Student("홍길동", 3, 18, "부산 동래구", "010-1234-5678");
		Student student2 = new Student();
		
		/*
		 * 기본생성자는 생략이 가능하다.
		 * 하지만 생성자오버로딩이 됐을 시
		 * 기본생성자를 사용하려면 꼭 명시를 해줘야 한다.
		 */
		
		student.showInfo();
		System.out.println();
		System.out.println(student.getName());
		System.out.println();
		
		student.setName("최연호");
		student.showInfo();
	}

	
	
}
