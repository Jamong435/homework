
public class Car {

	private String color;
	private int speed;

	// 기본 생성자를 정의를 정의해놓는다. 정의하지않는다면 파라미터없는 기본 메소드는 에러가 난다.
	public Car() {
		this.speed = 0;
		this.color = "";
	}
	
	//파라미터로 값이 온다면 이 값으로 this를 이용하여 초기화를 시킨다
	public Car(String color) {
		this.speed = 0;
		this.color = color;
	}

	//geter와 setter로 말그대로 get과 set을 시킨다
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
		System.out.println("속도가 올라갑니다.+10");
	}

	public void breakPedal() {
		this.speed -= 10;
		if (this.speed > 0) {
			System.out.println("속도가 줄어듭니다.-10");
		} else {
			System.out.println("멈췄습니다.");
			this.speed = 0;
		}
	}

	@Override
	public String toString() {
		return this.color+"현재 속도는 " + this.speed + " 입니다.";
	}

}