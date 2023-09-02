package j04_문자열;

public class StringBuilder2 {
	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder();

		String place = "금정구, 동래구, 사하구, 사상구, 강서구";
		
		/*
		 * StringBuilder를 활용하여
		 * 금정/동래/사하/사상/강서
		 * 가 출력되도록 하시오
		 */
		
		// 내 풀이
//		String address = place.replaceAll(", ", "/").replace("구", "");
//		stringBuilder.append(address);
//		System.out.println(stringBuilder);
		
		
		// 1번째 방법
		String address = place.substring(0, 2);
		stringBuilder.append(address);
		stringBuilder.append("/");
		
		stringBuilder.append(place.substring(5, 7));
		stringBuilder.append("/");
		
		stringBuilder.append(place.substring(10, 12));
		stringBuilder.append("/");
		
		stringBuilder.append(place.substring(15, 17));
		stringBuilder.append("/");
		
		stringBuilder.append(place.substring(20, 22));
		
		System.out.println(stringBuilder);
		
		// 또 다른 방법
		StringBuilder stringBuilder2 = new StringBuilder();

		int index = place.indexOf("구");
		stringBuilder2.append(place.substring(0, index)); // 금정
		stringBuilder2.append("/");
		
		index = place.indexOf("구", index + 1); // 그 다음에 있는 '구'를 찾아냄
		stringBuilder2.append(place.substring(index - 2, index)); // 동래
		stringBuilder2.append("/");
		
		index = place.indexOf("구", index + 1); // 그 다음에 있는 '구'를 찾아냄
		stringBuilder2.append(place.substring(index - 2, index)); // 사하
		stringBuilder2.append("/");
		
		index = place.indexOf("구", index + 1); // 그 다음에 있는 '구'를 찾아냄
		stringBuilder2.append(place.substring(index - 2, index)); // 사상
		stringBuilder2.append("/");
		
		index = place.indexOf("구", index + 1); // 그 다음에 있는 '구'를 찾아냄
		stringBuilder2.append(place.substring(index - 2, index)); // 강서

		System.out.println(stringBuilder);

//		int index2 = place.indexOf("구", 3); // index 3번 이후에 있는 '구'를 찾아냄
//		System.out.println(index2);
//		
//		System.out.println(place.indexOf("금"));
		
		StringBuilder stringBuilder3 = new StringBuilder();
		stringBuilder3.append(place);
		
		int index2 = stringBuilder3.indexOf("구");
		stringBuilder3.delete(index2, index2 + 3);
		
		index2 = stringBuilder3.indexOf("구");
		stringBuilder3.delete(index2, index2 + 3);
		
		index2 = stringBuilder3.indexOf("구");
		stringBuilder3.delete(index2, index2 + 3);
		
		index2 = stringBuilder3.indexOf("구");
		stringBuilder3.delete(index2, index2 + 3);
		
		index2 = stringBuilder3.indexOf("구");
		stringBuilder3.delete(index2, index2 + 1);
		
		System.out.println(stringBuilder3);
		
		
		
	}
}
