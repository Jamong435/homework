package homework1;
import java.util.Random;
import java.util.Scanner;

public class zzGame {

	public static void main(String[] args) {
		
		//Goal ���ھ߱� ������ ������
		
		//while���� ��� ������ �������� �ʴ´ٸ� �ѹ��� �ݺ����� ���� �� �ִ�.
		//������, do while���� ���� ������ �ѹ��� ����Ǵ� �ݺ����̴� 
		
		
		
		//�������� �� ���ڿ� ��ġ �մϴ�
		Random rnd= new Random();		
		int c100, c10, c1;
		do {
			c100= rnd.nextInt(10);
			c10= rnd.nextInt(10);
			c1= rnd.nextInt(10);
		// �� �ڸ����� ���� ���ڰ� �������������� while���� ���� do while���� ���մϴ�
		}while(c100==c10 || c100== c1 || c10==c1);
		
		//���������� ���� �����ϱ�!!
		//���ڸ� �������ִ� scanner �ʱ�ȭ ��Ų��
		Scanner scan= new Scanner(System.in);
		
		//���� Ƚ���� ���Ҽ��ִ� cnt
		int cnt=1;
		//�Է¹����� 
		int user;
		//�Է¹������� 100 10 1 �� �ڸ��� ���� ���Ҽ��ִ� ������
		int u100, u10, u1;
		int strike, ball;
		
		
		while(true) {
			//�ϴ� 0���� �ʱ�ȭ�س���
			strike=0; ball=0;
				
//����
//System.out.println(c100+""+c10+""+c1);
			
			System.out.println("["+ cnt+"ȸ ]");
			System.out.print("�ߺ����� �ʴ� 3�ڸ� �Է� : ");
			//user���� �ް�
			user= scan.nextInt();
			//user���� ���ڸ� ���ڷ� ������
			u100= user/100;
			u10= (user/10)%10;
			u1= user%10;
			
			//�� �ڸ� �����߿� �´°� �ִٸ� strike�� ++ �ϰ� Ȥ�� �´¼����ε�
			//�ڸ� ��ġ�� �ٸ��ٸ� ++�� �ִ´�.
			if(u100==c100) strike++;
			else if(u100==c10 || u100==c1) ball++;
			
			if(u10==c10) strike++;
			else if(u10==c100 || u10==c1) ball++;
			
			if(u1==c1) strike++;
			else if(u1==c100 || u1==c10) ball++;
			
			if( strike==3) {
				System.out.println("3strike �Դϴ�.\n �����մϴ�.");
				break;
			}
			
			System.out.println(strike+" strike,  "+ ball+" ball");
			System.out.println();
			cnt++;
			
			//10ȸ �̻��� �Ǹ� ���°ɷ� ǥ���ϰ� break���Ǵ�.
			if(cnt>9) {
				System.out.println("�����..������ȸ��!");
				break;
			}
		}
		
		
		
		
		

	}

}
