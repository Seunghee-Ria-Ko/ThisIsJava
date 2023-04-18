package ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 32강. 3.7 논리 연산자
		int charCode1 = 'A';		// 65
		int charCode2 = 'a';		// 97
		int charCode3 = '5';		// 53
		
		System.out.println(charCode1);
		System.out.println(charCode2);
		System.out.println(charCode3);
		
		if((65<=charCode1) && (charCode1 <= 122)) {
			System.out.println("It's uppercase");
		}
		
		if((97<=charCode2)&&(charCode2<=122)) {
			System.out.println("It's lowercase");
		}
		
		if((48<=charCode2)&&(charCode2<=57)) {
			System.out.println("Number from 0 to 9");
		}
		
		
		// ----------------------------------------
		
		
		int value = 6;
		// int value = 7;
		
		if((value%2 == 0) | (value%3 == 0)) {
			System.out.println("2 또는 3의 배수이군요,");
		}
	}

}
