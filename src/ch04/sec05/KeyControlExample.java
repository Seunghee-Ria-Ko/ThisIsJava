package ch04.sec05;
import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner value = new Scanner(System.in);
		
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1. INCREASE | 2. DECREASE | 3. STOP");
			System.out.println("-------------------------");
			System.out.print("chosen = ");
			
			String strNum = value.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("CURRENT SPEED = "+speed);
			}else if(strNum.equals("2")) {
				speed--;
				System.out.println("CURRENT SPEED = "+speed);
			}else if(strNum.equals("3")) {
				run = false;
			}
			
		}
		
		System.out.println("DONE");
		

	}

}
