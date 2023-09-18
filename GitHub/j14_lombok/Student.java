package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
import lombok.RequiredArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

@RequiredArgsConstructor
@AllArgsConstructor
//@Setter
//@Getter
//@EqualsAndHashCode
//@ToString
@Data
public class Student {
	
	private int studentCode;
	private String name;
	private int studentYear;
	private int age;
	
	/*
	 * 만들어야할 것
	 * 1. 기본생성자
	 * 2. 전체생성자
	 * 3. 겟터 세터
	 * 4. toString
	 * 5. 해쉬코드 and equals
	 */
}
