package com.programs;

public class Panagram {

	public static void main(String[] args) {
	
		String st = "the quick brown fox jumps over the lazy dog";
		
		boolean result = checkPanagram(st);
		if(result) System.out.println("Panagram");
		else System.out.println("Not a Panagram");

	}

	private static boolean checkPanagram(String st) {
		int size=26;
		System.out.println(st.length());
		st = removeSpaces(st);
		System.out.println(st.length());
		if(st.length()<size) return false;
		System.out.println(st.length());
		st=toLowerCase(st);
		
		for (char i = 'A'; i <='Z'; i++) {
			if((st.indexOf(i)<0)) return false;
		}
		return true;
	}

	private static String toLowerCase(String st) {
		String newStr="";
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++)
			if(ch[i]>=65&&ch[i]<=90) newStr=newStr+(char)(ch[i]+32);
			else newStr = newStr + ch[i];
		return newStr;
	}

	private static String removeSpaces(String st) {
		String newStr="";
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++)
			if(ch[i]!=' ') newStr=newStr+ch[i];
				
		return newStr;
	}

}
