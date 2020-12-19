package com.programs;

public class PatternsPrograms {

	public static void main(String[] args) {
	/*	
		int n =5;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		*/
		/*
		int n=7;
		
		for (int i = n; i >0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		int n =7;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
*/
		/*
		int n=7;
		int stars = 2*n-1;
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j<= i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < stars; j++) {
				System.out.print("*");
			}
			stars=stars-2;
			System.out.println();
		}
		*/
		
		int n =7;
		int spaces=n/2;
		int stars = 1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=stars; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=n/2) {
				spaces--;
				stars+=2;
			}else {
				spaces++;
				stars-=2;
			}
		}
	}

}
