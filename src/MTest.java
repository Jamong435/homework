
public class MTest {

	public static void main(String[] args) {
		
		
	//Goal : car class를 만들고  각 차종들에게 상속하고 생성자 오버로딩을 이용 
    //차종이 변할때마다 accel,break을 오버라이딩을 하여 값을 바꾸며 계념을 익힌다.
	
	//오버 로딩: 매개변수의 수, 타입이 다른경우 동일한 이름의 메소드를 여러개 정의할수있습니다
	//오버 라이딩: 부모 클래스의 메소드를 자식클래스에서 재정의를 하여 사용할수있습니다
		
		

		Car car1 = new Car("티코");
		car1.accelPedal();
		car1.accelPedal();
		car1.accelPedal();
		
		System.out.println(car1);
		car1.breakPedal();
		car1.breakPedal();
		car1.breakPedal();
		// 각 차종에 가속도값과 감속도값을 조정하여 속도가 0일떄는 차가 멈추게 한다	
		
		System.out.println("===================");
		
		Car car2 = new SportsCar("슈퍼카");
		car2.accelPedal();
		car2.accelPedal();
		System.out.println(car2);
		car2.breakPedal();
		car2.breakPedal();
		
		System.out.println("===================");
		
		Car car3 = new Truck("트럭");
		car3.accelPedal();
		car3.accelPedal();
		System.out.println(car3);
		car3.breakPedal();
		car3.breakPedal();
	}
	
	
	
}