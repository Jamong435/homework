
public class Car {

	private String color;
	private int speed;

	// �⺻ �����ڸ� ���Ǹ� �����س��´�. ���������ʴ´ٸ� �Ķ���;��� �⺻ �޼ҵ�� ������ ����.
	public Car() {
		this.speed = 0;
		this.color = "";
	}
	
	//�Ķ���ͷ� ���� �´ٸ� �� ������ this�� �̿��Ͽ� �ʱ�ȭ�� ��Ų��
	public Car(String color) {
		this.speed = 0;
		this.color = color;
	}

	//geter�� setter�� ���״�� get�� set�� ��Ų��
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void accelPedal() {
		this.speed += 10;
		System.out.println("�ӵ��� �ö󰩴ϴ�.+10");
	}

	public void breakPedal() {
		this.speed -= 10;
		if (this.speed > 0) {
			System.out.println("�ӵ��� �پ��ϴ�.-10");
		} else {
			System.out.println("������ϴ�.");
			this.speed = 0;
		}
	}

	@Override
	public String toString() {
		return this.color+"���� �ӵ��� " + this.speed + " �Դϴ�.";
	}

}