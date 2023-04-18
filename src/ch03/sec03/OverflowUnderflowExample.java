package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3.3 오버플로우와 언더플로우
		 */
		
		// byte 타입일 경우 최대값 127 최소값 -128
		byte var1 =125;
		for(int i=0; i<5; i++) {
			var1++;
			System.out.println("var1: "+var1);
		}
		
		
		System.out.println("----------------");
		
		byte  var2= -125;
		for(int i=0; i<5; i++) {
			var2--;
			System.out.println("var2: "+var2);
		}
	}

}
