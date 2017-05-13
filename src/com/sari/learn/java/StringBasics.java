package com.sari.learn.java;

public class StringBasics {

	public static void main(String[] args) {
		String s1 = "Saritha";
		String s2 = "saritha";
		String s3 = "SARITHA";
		String s4 = new String("Saritha");

		System.out.println(s1 + " | " + s2 + " | " + s3);
		System.out.println("A".compareTo("D"));
		System.out.println("D".compareTo("A"));

		System.out.println("s1 == s4 ->"+(s1 == s4));
		System.out.println("s1.equals(s4) ->"+s1.equals(s4));
		
		System.out.println("s1.equalsIgnoreCase(s3) ->"+s1.equalsIgnoreCase(s3));
	}
}
