package ch03.sec04;
/*
 * 정확한 계산은 실수 연산 보다 정수 연산으로 변경하기
 */

public class AccuracyExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		
		double result = apple - number*pieceUnit;
		System.out.println("Left apple: "+result);
	}

}
