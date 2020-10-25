public class Truck extends Car{

	public Truck() {
		super.setSpeed(0);
		super.setColor("black");
	}

	public Truck(String color) {
		super.setSpeed(0);
		super.setColor(color);
	}

	public void accelPedal() {
		super.setSpeed(super.getSpeed() + 5);
		System.out.println("�ӵ��� ������ �ö󰩴ϴ�.+5");
	}

	public void breakPedal() {
		super.setSpeed(super.getSpeed() - 5);
		if (super.getSpeed() > 0) {
			System.out.println("�ӵ��� ������ �������ϴ�.-5");
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