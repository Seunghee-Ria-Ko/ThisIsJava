package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		// byte < short, char < int < long < float < double
		// 자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: "+intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("'ga's unicode: "+intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: "+longValue);
		
		longValue = 100;
		float floatValue = longValue;     
		System.out.println("floatValue: "+floatValue);
	}

}
