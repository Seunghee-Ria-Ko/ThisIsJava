package ch04.sec03;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int)(Math.random()*4)+8;	// 8<= x <=11 사이의 정수
		System.out.println("CURRENT TIME: " + time + "");
		
		switch(time) {
		case 8:
			System.out.println("GO TO WORK");
		case 9:
			System.out.println("MEETING");
		case 10:
			System.out.println("WORK");
		default:
			System.out.println("GO OUT");
		}
	}

}
