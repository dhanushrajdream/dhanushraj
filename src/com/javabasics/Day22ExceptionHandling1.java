package com.javabasics;

public class Day22ExceptionHandling1 {

	public static void main(String[] args) {
		
		
		try {
			int a=55;
			System.out.println(a/0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("poda pani");
		}
		System.out.println("vada pani");
		}
	}

