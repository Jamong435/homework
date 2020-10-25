
public class SportsCar extends Car {

	public SportsCar() {
		super.setSpeed(0);
		super.setColor("black");
	}

	public SportsCar(String color) {
		super.setSpeed(0);
		super.setColor(color);
	}

	public void accelPedal() {
		super.setSpeed(super.getSpeed() + 15);
		System.out.println("�ӵ��� ������ �ö󰩴ϴ�.+15");
	}

	public void breakPedal() {
		super.setSpeed(super.getSpeed() - 15);
		if (super.getSpeed() > 0) {
			System.out.println("�ӵ��� ������ �������ϴ�.-15");
		} else {
			System.out.println("������ϴ�.");
			super.setSpeed(0);
		}
	}

	@Override
	public String toString() {
		return super.getColor()+"���� �ӵ��� " + super.getSpeed() + " �Դϴ�.";
	}
}