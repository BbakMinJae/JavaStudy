package j03_연산자;

public class Operation5 {
	public static void main(String[] args) {
		
		/*
		 * 점수 score
		 * 결과 result
		 * 
		 * 점수가 89보다 크면 (A학점)
		 * 점수가 79보다 크면 (B학점)
		 * 점수가 69보다 크면 (C학점)
		 * 점수가 59보다 크면 (D학점)
		 * 나머지는 (F학점)
		 * 점수가 0보다 작거나 100보다 크면 (계산불가)
		 */
		
		int score = -1;
		String result = null;
		
		result = score > 89 ? "A학점" 
						: score > 79 ? "B학점" 
						: score > 69 ? "C학점" 
						: score > 59 ? "D학점"
						: score < 0 || score > 100 ? "계산불가" 
						: "F학점";
		
		System.out.println(result);
	}
}
