package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 나눗셈 연산 후 NaN과 Infinity 처리
		//int x = 5;
		//int y = 0;
		//int result = x/y;
		//System.out.println(result);	// error
		
		// 하지만 좌측 피연산자가 실수이거나 우측 피연산자가 0.0 또는 0.0f이면 예외가 발생하지 않고 연산의 결과는 Infinity(무한대) 또는 NaN이 된다.
		// 5 / 0.0 -> Infinity
		// 5 % 0.0 -> NaN
		//System.out.println(5/0.0);
		//System.out.println(5%0.0);
		
		// Infinity + 2 -> Infinity
		// NaN + 2 -> NaN 
		
		// /와 % 연산의 결과가 Infinity 또는 NaN인지 먼저 확인하고 다음 연산을 수행하느 것이 좋다.
		// 확인하기 위해서는 Double.isInfinite()와 Double.isNaN()를 사용한다.\
		//boolean result1 = Double.isInfinite(x);
		//boolean result2 = Double.isNaN(x);
		
		int x = 5;
		double y = 0.0;
		double z = x / y;
		double zz = x % y;
		System.out.println(z);
		System.out.println(zz);

		// 잘못된 코드
		System.out.println(z+2);
		
		// 알맞은 코드
		if(Double.isInfinite(z) || Double.isNaN(z)){
			 System.out.println("Cannot Calculate");
		}else{
			System.out.println(z+2);
		}
	}

}
