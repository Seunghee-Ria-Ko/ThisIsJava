package ch02.sec10;

public class Printf {
	public static void main(String[] args) {
		/*
		printf("형식문자열", 값1, 값2, ...)

		형식문자열


		%[argument_index$][flags][width][.precision]coversion

		값의 순번/ -,0 / 전체 자릿수 / 소수 자릿수 / 변환문자
		(		생략가능			)


		형식 문자열에서 %와 conversion (변환 문자)은 필수로 작성하고 그 외의 항목은 모두 생략할 수 있다.
		%는 형식 문자열의 시작을 뜻하고, conversion에는 제공되는 값의 타입에 따라 d(정수), f(실수), s(문자열)가 온다.



		flags는 빈 공간을 채우는 방법
		생략되면 왼쪽이 공백으로 채워지고
		-가 오면 오른쪽이 공백으로 채워짐
		0은 공백 대신 0으로 채움
		width는 소수점을 포함한 전체 자릿수이며,
		.precision은  소수 이하 자릿수이다.
		*/
		
		System.out.printf("Name: %s", "Ria");	// Name: Ria
		System.out.println("");
		System.out.printf("Age: %d", 29);	// Age: 29
		System.out.println("");
		System.out.printf("Name: %1$s, Age: %2$d", "Ria", 29);
		System.out.println("");
		
		
		// 정수
		System.out.println("------Integer / Whole Number------");
		System.out.printf("Print-%d", 123);
		System.out.println("");
		System.out.printf("Print-%6d", 123);		
		System.out.println("");
		System.out.printf("Print-%-6d", 123);		
		System.out.println("");
		System.out.printf("Print-%06d", 123);
		System.out.println("");
		
		// 실수
		System.out.println("------Real Number------");
		System.out.printf("Print-%10.2f",123.45);
		System.out.println("");
		System.out.printf("Print-%-10.2f",123.45);
		System.out.println("");
		System.out.printf("Print-%010.2f",123.45);
		System.out.println("");
		
		// 문자열
		System.out.println("------String------");
		System.out.printf("%s","abc");
		System.out.println("");
		System.out.printf("%6s","abc");
		System.out.println("");
		System.out.printf("%-6s","abc");
		System.out.println("");

	}
}
