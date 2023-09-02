package j07_반복;

public class For4 {
	public static void main(String[] args) {
		/*
		 * 
		 * 강덕현, 강민석, 김결휘, 김지후, 손수빈, 이준우
		 * 
		 * 강덕현
		 * 강민석
		 * 김결휘
		 * 김지후
		 * 손수빈
		 * 이준우
		 */
		
		String str = "강덕현, 강민석, 김결휘, 김지후, 손수빈, 이준우";
		int index = str.length() / 5 + 1;
		System.out.println(index);
		
		//0,3
		//5,8
		//10,13
		for(int i = 0; i < index; i++) {
			System.out.println(str.substring(i * 5, (i * 5) + 3));
		
		}
	}
}
