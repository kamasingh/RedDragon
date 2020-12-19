package com.programs;

public class StringsPrograms {

	public static void main(String[] args) {
		
		String s1="Si l ent";
		String s2="liSTe n";
		
		boolean result=checkAnagram(s1,s2);
		
		if(result) System.out.println("Anagram");
		else System.out.println("Not an Anagram");

	}

	private static boolean checkAnagram(String s1, String s2) {
		
		s1=removeSpaces(s1);
		s2=removeSpaces(s2);
		if(s1.length()!=s2.length()) return false;
		s1=toLowerCase(s1);
		s2=toLowerCase(s2);
		s1=sort(s1);
		s2=sort(s2);
		
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
	
		for (int i = 0; i < ch2.length; i++) {
			if(ch1[i]!=ch2[i])	return false;
			
		}
		return true;
	}

	private static String sort(String s1) {
		char[] ch = s1.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length-i-1; j++) {
				if(ch[j]>ch[j+1]) {
				char t = ch[j];
				ch[j]=ch[j+1];
				ch[j+1]=t;
				}
			} 
		}
		String newStr = new String(ch);
		return newStr;
	}

	private static String toLowerCase(String s1) {
		String newStr="";
		
		char[] ch = s1.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>=65 && ch[i]<=90) {
				newStr=newStr+(char)(ch[i]+32);
			}else {
				newStr=newStr+ch[i];
			}
		}
		
		return newStr;
	}

	private static String removeSpaces(String s1) {
		
		String newStr="";
		char[] ch = s1.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=' ') newStr = newStr+ch[i];
		}
		return newStr;
	}

}
