package com.String.Operations;

import java.util.Scanner;

public class StringOp {
	public static void main(String[] args) {
		String s1, s2;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		
		String s3 = s1.concat(" ").concat(s2);
		String s4 = s1+" "+s2;
		System.out.println("Result of Concatination is : "+s3);
		System.out.println("Another Concatination is : "+s4);
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		System.out.println("String 1 length is: "+l1);
		System.out.println("String 2 length is: "+l2);
		
		s1 = s1.toUpperCase();
		System.out.println("First String Value in Upper Case : "+s1);

	}

}
