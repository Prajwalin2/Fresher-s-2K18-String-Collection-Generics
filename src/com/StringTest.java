package com;

public class StringTest {
	
	public static void main(String[] args) {
		//System.out.println("a".concat("b"));
		//System.out.println("abc".indexOf("ba"));
		//System.out.println("abc".contains("bc"));
		//System.out.println("abc".equals("ABc"));
		/*String[] strArray = "ab,cd,ef".split(",");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}*/
		
		StringBuilder sb = new StringBuilder("abc");
		for (int i = 0; i < 1000; i++) {
			sb.append("a"+i);
		}
		String s = sb.toString();
		System.out.println(s);
	}

}
