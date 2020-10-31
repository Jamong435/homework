package homework2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 어떤 대학의 정보제공 앱 제작 - 회원가입 가능
		// 회원종류 : 일반회원, 학생, 교수, 근로학생

		// 1. 일반회원 : 이름, 나이
		// 2. 학 생 : 이름, 나이, 전공
		// 3. 학 생 2 : 이름, 나이, 전공		
		// 4. 교 수 : 이름, 나이, 연구과제
		// 5. 근로학생 : 이름, 나이, 전공, 업무
		// 6. 노동자 : 이름, 나이, 업무
		// 7. 깡패 : 이름,나이, 총 소지여부

		// 일반회원
		Person p = new Person("sam", 20);
		p.show();

		// 학생
		Student stu = new Student("robin", 25, "android");
		stu.show();
		
		Student2 stu2 = new Student2("kevin",25,"phython");
		stu2.show();

		// 교수
		Professor pro = new Professor("lee", 50, "mobile optimization");
		pro.show();

		// 근로학생
		AlbaStudent alba = new AlbaStudent("hong", 23, "web", "pc management");
		alba.show();

		//노동자
		worker worker = new worker("kim", 25, "worksomething");
		worker.show();
		
		//깡패
		gangster gangster = new gangster("kim",25,"have");
		gangster.show();

	}

}

class Person {

	private String name;
	private int age;

	// 생성자 메소드 : 객체생성(new)될때 자동으로 실행되는 메소드
	public Person() {
		name = "no name";
		age = 0;
	}

	// 생성자 오버로딩
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}

}

class Student extends Person {

	// 이미 name, age를 보유한 상태!!
	private String major; // 전공

	public Student() {
		super();
		major = "";
	}

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	// 오버라이드
	public void show() {
		super.show();
		System.out.println("major : " + major);
	}

}
class Student2 extends Person {

	// 이미 name, age를 보유한 상태!!
	private String major; // 전공

	public Student2() {
		super();
		major = "";
	}

	public Student2(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	// 오버라이드
	public void show() {
		super.show();
		System.out.println("major : " + major);
	}

}


class Professor extends Person {

	private String subject = "";

	public Professor() {
		// TODO Auto-generated constructor stub
	}

	// 생성자 오버로딩
	public Professor(String name, int age, String subject) {
		// TODO Auto-generated constructor stub
		super(name, age);
		this.subject = subject;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("subject : " + subject);
	}

}

class AlbaStudent extends Student {

	private String task = new String("");

	public AlbaStudent() {
		// TODO Auto-generated constructor stub
	}

	public AlbaStudent(String name, int age, String major, String task) {
		super(name, age, major);
		// TODO Auto-generated constructor stub
		this.task = task;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("task : " + task);
	}

}

class worker extends Person {

	private String job; // 일

	public worker() {
		super();
		job = "";
	}

	public worker(String name, int age, String job) {
		super(name, age);
		this.job = job;
	}

	// 오버라이드
	public void show() {
		super.show();
		System.out.println("job : " + job);
	}

}
class gangster extends Person {

	private String gunhave; // 일

	public gangster() {
		super();
		gunhave = "";
	}

	public gangster(String name, int age, String gunhave) {
		super(name, age);
		this.gunhave = gunhave;
	}

	// 오버라이드
	public void show() {
		super.show();
		System.out.println("gunhave : " + gunhave);
	}

}


