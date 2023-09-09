package j09_클래스.접근지정자.student;

public class Student {
	
	private String name;
	private int studentYear;
	private int age;
	private String address;
	private String phone;
	
	//기본 생성자
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	//전체 생성자
	public Student(String name, int studentYear, int age, String address, String phone) {
		this.name = name;
		this.studentYear = studentYear;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(studentYear);
		System.out.println(age);
		System.out.println(address);
		System.out.println(phone);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
