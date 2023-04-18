package ch04.sec03;

public class SwtichExpressionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
			case 'A','a'->{
				System.out.println("GOOD");;
			}
			case 'B','b'->{
				System.out.println("SOSO");
			}
			default -> {
				System.out.println("CUSTOMER");
			}
		}
		
		
		switch(grade) {
		case 'A','a'->System.out.println("GOOD");
		case 'B','b'->System.out.println("SOSO");
		default -> System.out.println("CUSTOMER");
		}
	}

}
