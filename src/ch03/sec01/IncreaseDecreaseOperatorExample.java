package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 26강. 3.1 부호 연산자와 증감 연산자
		 */
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;	
		++x;	
		System.out.println("x="+x);	// 12
		
		System.out.println("-----------------");
		y--;	// 9
		--y;	
		System.out.println("y="+y);		// 8
		
		System.out.println("-----------------");
		z = x++;
		System.out.println("z="+z);		// 12
		System.out.println("x="+x);		// 13
		
		System.out.println("-----------------");
		z = ++x;
		System.out.println("z="+z);		// 14
		System.out.println("x="+x);		// 14
		
		System.out.println("-----------------");
		z = ++x + y++;	// 14 + 9
		System.out.println("z="+z);		// 23
		System.out.println("x="+x);		// 15
		System.out.println("y="+y);		// 9
	}

}
