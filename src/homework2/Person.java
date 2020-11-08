package homework2;

public class Person {
	
	
	
	
	
	
	private String name; // 이름
	private String phone; // 전화번호
	private String gender ; // 성별
	private String address; // 주소
	private String email; // 이메일
	private int age; //나이
	private int height; //키
	private boolean coronaYN; // 코로나 감염여부
	
	
	public Person(String name, String phone, String gender, String address, String email, int age, int height,
			boolean coronaYN) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.age = age;
		this.height = height;
		this.coronaYN = coronaYN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public boolean isCorona() {
		return coronaYN;
	}
	public void setCorona(boolean corona) {
		this.coronaYN = corona;
	}
	
	
	

}