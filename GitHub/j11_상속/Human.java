package j11_상속;

public class Human extends Animal{
	
	public Human() {
		System.out.println("human 기본생성자 호출");
		System.out.println();
	}
	
	public void study() {
		System.out.println("인간이 공부를 합니다.");
	}
	
	//오버라이딩 : 재정의
	@Override
	public void eat() {
		System.out.println("human에 있는 eat");
		System.out.println("춤을 춥니다.");
	}
}
