package ch04.sec03;

public class SwtichCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'a';
		
		switch(grade){
			case 'A':
			case 'a':
				System.out.println("GOOD");
				break;
			case 'B':
			case 'b':
				System.out.println("SOSO");
				break;
			default:
				System.out.println("CUSTOMER");
					
		}
	}

}
