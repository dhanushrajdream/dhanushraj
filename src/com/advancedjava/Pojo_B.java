package com.advancedjava;


public class Pojo_B {
	
	public static void main(String[] args) {
		
		Pojo_A s = new Pojo_A();
		
		int age = s.getAge();
		System.out.println(age);
		
		
		s.setAge(34);
		
		int age2 = s.getAge();
		System.out.println(age2);
		
		s.setAge(45);
		
		int age3 = s.getAge();
		System.out.println(age3);
		
	}

}
