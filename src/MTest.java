
public class MTest {

	public static void main(String[] args) {
		
		
	//Goal : car class�� �����  �� �����鿡�� ����ϰ� ������ �����ε��� �̿� 
    //������ ���Ҷ����� accel,break�� �������̵��� �Ͽ� ���� �ٲٸ� ����� ������.
	
	//���� �ε�: �Ű������� ��, Ÿ���� �ٸ���� ������ �̸��� �޼ҵ带 ������ �����Ҽ��ֽ��ϴ�
	//���� ���̵�: �θ� Ŭ������ �޼ҵ带 �ڽ�Ŭ�������� �����Ǹ� �Ͽ� ����Ҽ��ֽ��ϴ�
		
		

		Car car1 = new Car("Ƽ��");
		car1.accelPedal();
		car1.accelPedal();
		car1.accelPedal();
		
		System.out.println(car1);
		car1.breakPedal();
		car1.breakPedal();
		car1.breakPedal();
		// �� ������ ���ӵ����� ���ӵ����� �����Ͽ� �ӵ��� 0�ϋ��� ���� ���߰� �Ѵ�	
		
		System.out.println("===================");
		
		Car car2 = new SportsCar("����ī");
		car2.accelPedal();
		car2.accelPedal();
		System.out.println(car2);
		car2.breakPedal();
		car2.breakPedal();
		
		System.out.println("===================");
		
		Car car3 = new Truck("Ʈ��");
		car3.accelPedal();
		car3.accelPedal();
		System.out.println(car3);
		car3.breakPedal();
		car3.breakPedal();
	}
	
	
	
}