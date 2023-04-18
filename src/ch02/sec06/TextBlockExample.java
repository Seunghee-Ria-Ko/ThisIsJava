package ch02.sec06;

public class TextBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "" +
		"{\n" +
				"\t\"id\":\"winter\",\n" +
		"\t\"name\":\"눈송이\"\n" +
				"}";
		
		String str2 = """
			{
					"id":"winder",
					"name":"눈송이"
			}
		""";
		
		String str3 = """
			나는 자바를 \
			학습힙니다.
			나는 자바 고수가 될 겁니다.
				""";
		
		
		System.out.println(str1);
		System.out.println("-------------------");
		System.out.println(str2);
		System.out.println("-------------------");
		System.out.println(str3);
	}

}
