package homework1;
import java.util.Random;
import java.util.Scanner;

public class zzGame {

	public static void main(String[] args) {
		
		//Goal 숫자야구 게임을 만들어본다
		
		//while문의 경우 조건이 만족하지 않는다면 한번도 반복하지 않을 수 있다.
		//하지만, do while문의 경우는 무조건 한번은 실행되는 반복문이다 
		
		
		
		//랜덤으로 각 숫자에 배치 합니당
		Random rnd= new Random();		
		int c100, c10, c1;
		do {
			c100= rnd.nextInt(10);
			c10= rnd.nextInt(10);
			c1= rnd.nextInt(10);
		// 각 자리수에 들어가는 숫자가 같지않을때까지 while문을 쓰는 do while문을 구합니다
		}while(c100==c10 || c100== c1 || c10==c1);
		
		//정해졌으면 게임 시작하기!!
		//숫자를 넣을수있는 scanner 초기화 시킨다
		Scanner scan= new Scanner(System.in);
		
		//게임 횟수를 정할수있는 cnt
		int cnt=1;
		//입력받을값 
		int user;
		//입력받을값을 100 10 1 의 자리를 각각 비교할수있는 변수값
		int u100, u10, u1;
		int strike, ball;
		
		
		while(true) {
			//일단 0으로 초기화해놓고
			strike=0; ball=0;
				
//정답
//System.out.println(c100+""+c10+""+c1);
			
			System.out.println("["+ cnt+"회 ]");
			System.out.print("중복되지 않는 3자리 입력 : ");
			//user값을 받고
			user= scan.nextInt();
			//user값을 각자리 숫자로 나누고
			u100= user/100;
			u10= (user/10)%10;
			u1= user%10;
			
			//각 자리 숫자중에 맞는게 있다면 strike를 ++ 하고 혹시 맞는숫자인데
			//자리 위치만 다르다면 ++를 넣는다.
			if(u100==c100) strike++;
			else if(u100==c10 || u100==c1) ball++;
			
			if(u10==c10) strike++;
			else if(u10==c100 || u10==c1) ball++;
			
			if(u1==c1) strike++;
			else if(u1==c100 || u1==c10) ball++;
			
			if( strike==3) {
				System.out.println("3strike 입니다.\n 축하합니다.");
				break;
			}
			
			System.out.println(strike+" strike,  "+ ball+" ball");
			System.out.println();
			cnt++;
			
			//10회 이상이 되면 지는걸로 표시하고 break를건다.
			if(cnt>9) {
				System.out.println("졌어요..다음기회에!");
				break;
			}
		}
		
		
		
		
		

	}

}
