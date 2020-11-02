package homework2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// � ������ �������� �� ���� - ȸ������ ����
		// ȸ������ : �Ϲ�ȸ��, �л�, ����, �ٷ��л�

		// 1. �Ϲ�ȸ�� : �̸�, ����
		// 2. �� �� : �̸�, ����, ����
		// 3. �� �� 2 : �̸�, ����, ����		
		// 4. �� �� : �̸�, ����, ��������, �г�
		// 5. �ٷ��л� : �̸�, ����, ����, ���� , ������, �г�
		// 6. �뵿�� : �̸�, ����, ����
		// 7. ���� : �̸�,����, �� ��������

		// �Ϲ�ȸ��
		Person p = new Person("sam", 20);
		p.show();

		// �л�
		Student stu = new Student("robin", 25, "android");
		stu.show();
		
		Student2 stu2 = new Student2("kevin",25,"phython");
		stu2.show();

		// ����
		Professor pro = new Professor("lee", 50, "mobile optimization",5);
		pro.show();

		// �ٷ��л�
		AlbaStudent alba = new AlbaStudent("hong", 23, "web", "pc management",80,3);
		alba.show();

		//�뵿��
		worker worker = new worker("kim", 25, "worksomething");
		worker.show();
		
		//����
		gangster gangster = new gangster("kim",25,"have");
		gangster.show();

	}

}

class Person {

	private String name;
	private int age;

	// ������ �޼ҵ� : ��ü����(new)�ɶ� �ڵ����� ����Ǵ� �޼ҵ�
	public Person() {
		name = "no name";
		age = 0;
	}

	// ������ �����ε�
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

	// �̹� name, age�� ������ ����!!
	private String major; // ����

	public Student() {
		super();
		major = "";
	}

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	// �������̵�
	public void show() {
		super.show();
		System.out.println("major : " + major);
	}

}
class Student2 extends Person {

	// �̹� name, age�� ������ ����!!
	private String major; // ����

	public Student2() {
		super();
		major = "";
	}

	public Student2(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	// �������̵�
	public void show() {
		super.show();
		System.out.println("major : " + major);
	}

}


class Professor extends Person {

	private String subject = "";
	private int grade ;

	public Professor() {
		// TODO Auto-generated constructor stub
	}

	// ������ �����ε�
	public Professor(String name, int age, String subject, int grade) {
		// TODO Auto-generated constructor stub
		super(name, age);
		this.subject = subject;
		this.grade= grade;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("subject : " + subject);
		System.out.println("subject : " + grade);
	}

}

class AlbaStudent extends Student {

	private String task = new String("");
	private int weight;
	private int grade;

	public AlbaStudent() {
		// TODO Auto-generated constructor stub
	}

	public AlbaStudent(String name, int age, String major, String task , int weight ,int grade) {
		super(name, age, major);
		// TODO Auto-generated constructor stub
		this.task = task;
		this.weight= weight;
		this.grade= grade;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("task : " + task);
		System.out.println("weight:" + weight);
		System.out.println("grade" + grade);
		
	}

}

class worker extends Person {

	private String job; // ��

	public worker() {
		super();
		job = "";
	}

	public worker(String name, int age, String job) {
		super(name, age);
		this.job = job;
	}

	// �������̵�
	public void show() {
		super.show();
		System.out.println("job : " + job);
	}

}
class gangster extends Person {

	private String gunhave; // ��

	public gangster() {
		super();
		gunhave = "";
	}

	public gangster(String name, int age, String gunhave) {
		super(name, age);
		this.gunhave = gunhave;
	}

	// �������̵�
	public void show() {
		super.show();
		System.out.println("gunhave : " + gunhave);
	}

}


