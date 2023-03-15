package com.sundar;

public class D29_Count_The_Vowels {
	
	public static void main(String[] args) {
		String s="welcoME TO the JURASSIc park ha ha ";
		char c[]=s.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a' || c[i]=='e' || c[i]=='i'|| c[i]=='o'|| c[i]=='u'|| c[i]=='A' || c[i]=='E' || c[i]=='I'|| c[i]=='O'|| c[i]=='U') {
				count=count+1;
				System.out.println(c[i]);
			}
		}
		System.out.println("Vowels count "+count);
		
	}

}
