package com.sari.learn.java.oops;

import com.sari.learn.java.oops.dto.Employee;

public class ClassBasicExample {

	// private static String place;

	public static void main(String[] args) {

		Employee v1 = new Employee(123, "Sari", true);
		Employee v2 = new Employee(124, "Hari", true);
		Employee v3 = new Employee(125, "Nanda", false);
		Employee v4 = new Employee(123, "Sari", true);

		// Variables.place = "place1";
		System.out.println("v1 --> " + v1.toString());
		System.out.println(v2.toString());
		System.out.println(v3.toString());
		System.out.println(v4.toString());

		System.out.println("v1.equals(v4)   ->" + v1.equals(v4));
		System.out.println("v1==v4   ->" + (v1 == v4));
	}

}
