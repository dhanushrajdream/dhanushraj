package com.dhanushpractisedall;

public class Edh11_PalindromeString {
	
	public static void main(String[] args) {
		
	 String original ="naan";	
	 String reverse ="";
	
	 for(int i=original.length()-1;i>=0;i--) {
		 
		 reverse=reverse+original.charAt(i);
		 
		 
		 
	 }if(original.equals(reverse)) {
		 
		 System.out.println("palindrome= "+reverse);
		 
		 
	 }else{
		 System.out.println("not palindrome= "+reverse);
		 
	 }
	
		
		
		
	}

}
