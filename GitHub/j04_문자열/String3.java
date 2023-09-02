package j04_문자열;

public class String3 {
	public static void main(String[] args) {
		String address = "부산 서구 부민동";
		/*
		 * "부"의 위치 찾는 방법을 활용하여
		 * "부산 서구"를 출력하세요
		 */
		int index = address.indexOf("부");
		int lastIndex = address.lastIndexOf("부");
		String subAddress = address.substring(index, lastIndex - 1);
		System.out.println(subAddress);
		
		System.out.println(address);
		
		String replaceAddress = address.replace(' ', '-');
		System.out.println(replaceAddress);
		System.out.println(address);
		
		String replaceAllAddress = address.replaceAll("부민동",  "연산동");
		System.out.println(replaceAllAddress);
	}
}
