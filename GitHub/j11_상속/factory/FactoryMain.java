package j11_상속.factory;

public class FactoryMain {
	public static void main(String[] args) {
//		SamsungFactory samsungFactory = new SamsungFactory(1);
//		samsungFactory.start();
		
		/*
		 * 삼성공장배열 3개 만들고
		 * 각각의 삼성공장을 모두 가동
		 * 각각의 삼성공장을 모두 중지
		 * 
		 * 엘지공장배열 3개를 만들고
		 * 각각의 엘지공장을 모두 가동
		 * 각각의 엘지공장을 모두 중지
		 */
		
		SamsungFactory[] samsungFactories = new SamsungFactory[3];
		samsungFactories[0] = new SamsungFactory(1);
		samsungFactories[1] = new SamsungFactory(2);
		samsungFactories[2] = new SamsungFactory(3);

		
		
		for(int i = 0; i < samsungFactories.length; i++) {
			samsungFactories[i].start();
		}
		
		for(int i = 0; i < samsungFactories.length; i++) {
			samsungFactories[i].stop();
		}
		
		LGFactory[] lgFactories = new LGFactory[3];
		lgFactories[0] = new LGFactory(1);
		lgFactories[1] = new LGFactory(2);
		lgFactories[2] = new LGFactory(3);

		for(int i = 0; i < lgFactories.length; i++) {
			lgFactories[i].start();
		}
		
		for(int i = 0; i < lgFactories.length; i++) {
			lgFactories[i].stop();
		}
	}
}
