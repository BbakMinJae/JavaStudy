package j07_반복;

public class Continue2 {
	public static void main(String[] args) {
		
		String str = "홍길동";
		System.out.println(str.equals("홍길동"));
		System.out.println(str.equals("홍길")); 
		
		/*
		 * 최창규님, 정지윤님,전수빈님/오재근님
		 * 
		 * 반복을 돌려서 이름만 남겨두고 출력하시오
		 * 
		 * 최창규정지윤전수빈오재근
		 */
		
		String names = "최창규님, 정지윤님,전수빈님/오재근님";
		String totalNames = null;
		
		for (int i = 0; i < names.length(); i++) {
			String subNames = names.substring(i, i + 1);
			
			if (subNames.equals("님") 
					|| subNames.equals(",") 
					|| subNames.equals(" ") 
					|| subNames.equals("/"))
				continue;
			totalNames += subNames;
		}
		System.out.println(totalNames.substring(4));
	}
}
