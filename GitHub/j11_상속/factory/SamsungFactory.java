package j11_상속.factory;

public class SamsungFactory extends Factory{

	public SamsungFactory(int factoryNumber) {
		super(factoryNumber);
//		System.out.println("자식 생성자 호출");
	}
	
//	public SamsungFactory() {
//		super(1);
//	}
	
	@Override
	public void start() {
		System.out.print("삼성 ");
		super.start();
	}

	@Override
	public void stop() {
		System.out.print("삼성 ");
		super.stop();
	}
		
	public void produceSmartPhone() {
		System.out.println("삼성 스마트폰을 만듭니다.");
	}
}
