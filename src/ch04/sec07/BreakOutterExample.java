package ch04.sec07;

public class BreakOutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Outter:for(char upper='A'; upper<='Z'; upper++) {
				for(char lower='a'; lower<='z';lower++) {
					System.out.println(upper + "-" + lower);
					if(lower=='9') {
						break Outter;
					}
				}
			}
			System.out.println("DONE!");
	}

}
