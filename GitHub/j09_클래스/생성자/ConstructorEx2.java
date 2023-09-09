package j09_클래스.생성자;

public class ConstructorEx2 {
	
	String top;
	String color;
	int size;
	


	public ConstructorEx2(String top) {
		super();
		this.top = top;
	}
	// color 넣는 거 뒤에서 언급

	public ConstructorEx2(int size) {
		super();
		this.size = size;
	}

	public ConstructorEx2(String top, String color) {
		super();
		this.top = top;
		this.color = color;
	}

	public ConstructorEx2(String top, int size) {
		super();
		this.top = top;
		this.size = size;
	}
	
	public ConstructorEx2(String top, String color, int size) {
		super();
		this.top = top;
		this.color = color;
		this.size = size;
	}
	
	/*
	 * 기본
	 * 필수(
	 * 		top
	 * 		size
	 * 		color
	 * 		top color
	 * 		top size
	 * 		color size(오버로딩 안됨)
	 * 전체
	 */
	
	
}
