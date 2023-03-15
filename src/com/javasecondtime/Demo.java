package com.javasecondtime;

public class Demo extends AB {
	
	
	 // Main method
    public static void main(String args[])
    {
        // Creating multiple objects
        // for class A
    	AB obj1 = new AB();
        AB obj2 = new AB();
        AB obj3 = new AB();
 
        // Assigning the different values
        // for the non static variable N
        obj1.N = 3;
        obj2.N = 4;
        obj3.N = 5;
 
        // Calling the method
        AB.increment();
 
        System.out.println(obj1.N);
        System.out.println(obj2.N);
        System.out.println(obj3.N);
    }
	
	
	
	/* // Main method
    public static void main(String args[])
    {
        // Creating  objects
        // for class A(NonStaticVariable_In_StaticVariable)
    	NonStaticVariable_In_StaticVariable obj1 = new NonStaticVariable_In_StaticVariable();

 
        // Assigning the different values
        // for the non static variable N
        obj1.n = 3;
      
        // Calling the method
        NonStaticVariable_In_StaticVariable.increment();
 
        System.out.println(obj1.n);
      
    }
    */
}
