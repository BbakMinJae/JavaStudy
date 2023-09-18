package j14_lombok;

public class BuilderMain {
	
	public static void main(String[] args) {
		
		Builder builder = new Builder();
		Car car = builder.builder().
				company("현대").model("k5").color("화이트").build();
		
		System.out.println(car);
		
		Car car2 = builder.builder().color("red").build();
		System.out.println(car2);
		
		Car car3 = builder.builder()
					.color("red")
					.model("k7")
					.build();
		System.out.println(car3);
		
		// setter로 값을 넣으므로 순서상관없음.
	}
}

