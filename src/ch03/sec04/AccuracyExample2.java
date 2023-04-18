package ch03.sec04;

public class AccuracyExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		int totalPieces = apple * 10;
		int number = 7;
		
		int result = totalPieces - number;
		System.out.println("Left pieces out of 10: " + result);
		System.out.println("Left apple out of one: " + result/10.0);
	}

}
