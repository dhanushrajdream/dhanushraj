package com.javasecondtime;

public class Abc {
	
	
		  public static int aStaticVariable = 1;
		  public int aNonStaticVariable = 2;
		  int g=5;
		 
		  public static void aStaticMethod() {
		    Abc object = new Abc();
		    System.out.println(object.aNonStaticVariable);
		    object.aNonStaticMethod();
		    System.out.println(object.g);
		  }
		 
		  public void aNonStaticMethod() {
		    System.out.println(aStaticVariable);
		  }
		 
		  	public static void main(String[] args) {
				
		  		aStaticMethod();
		  		
		  		
			}
		

}
