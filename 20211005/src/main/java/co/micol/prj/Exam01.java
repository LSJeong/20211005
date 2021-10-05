package co.micol.prj;

public class Exam01 {
	private String str = "20001004"; //yyyymmdd
	private String nstr = "1234";
	private String mstr = "3456";
	private String cstr = " akcd efg.jsp.old ";
	
	void stringTest() {
		System.out.println(str.charAt(3)); 
		System.out.println(str.codePointAt(2)); // 그 위치문자 아스키코드 값
		System.out.println(str.codePointBefore(2));
		System.out.println(str.startsWith("ab")); //저 문자로 시작하냐? boolean 값으로 출력
		System.out.println(str.endsWith("fg")); //저 문자로 끝나냐? boolean 값으로 출력
		
		System.out.println(str.toString());
		System.out.println(nstr.toString());
		System.out.println(nstr+mstr);
		
		int n = Integer.valueOf(nstr);
		int m = Integer.valueOf(mstr);
		System.out.println(n+m);
		
//		if(str.equals(cstr)) System.out.println(cstr);
		
		String mm = str.substring(4,6); //4번째부터 6번째까지
		String dd = str.substring(6); //6번째부터 끝까지
		System.out.println("귀하의 생일은 " + mm + "월 " + dd + "일 입니다.");
		
		int l = cstr.indexOf(".");
		System.out.println(cstr.substring(0,l));
		
		System.out.println(cstr.replace("k", "B"));
		System.out.println(cstr.concat("xyz"));
		System.out.println(cstr.toUpperCase());
		System.out.println(cstr.getBytes());
		System.out.println(cstr.trim()); //양끝 공백 제거
		
		char c = 'a';
		String cs = String.valueOf(c); // char type 을 String type으로 변환
		String s = "a";
		if(s.equals(cs)) System.out.println(c);
		
		
	}
}
