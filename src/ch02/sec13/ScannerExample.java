package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter x : ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("Enter y : ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x+y;		
		System.out.println("x + y : "+result);
		System.out.println();
		
		
		while(true) {
			System.out.print("Enter Character: ");
			String data = scanner.nextLine();
			if(data.equals("q")){
				break;
			}
			
			System.out.println("Entered Character: "+data);
			System.out.println();
		}
	
		System.out.println("DONE");
	}

}
