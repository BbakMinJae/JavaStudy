package j14_lombok;

public class MypetMain {
	
	public static void main(String[] args) {
		
		Mypet mypet = Mypet.builder()
					.name("시츄")
					.age(2)
					.build();
		System.out.println(mypet);
	}
}
