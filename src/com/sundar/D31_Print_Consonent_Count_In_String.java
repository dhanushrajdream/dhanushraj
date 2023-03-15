package com.sundar;

public class D31_Print_Consonent_Count_In_String {
	public static void main(String[] args) {
		String s="welcoMETOtheJURASSIcparkhaha ";
		
		char c[]=s.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++) {
			if(!(c[i]=='a' || c[i]=='e' || c[i]=='i'|| c[i]=='o'|| c[i]=='u'|| c[i]=='A' || c[i]=='E' || c[i]=='I'|| c[i]=='O'|| c[i]=='U')) {
				count=count+1;
				System.out.println(c[i]);
			}
		}
		System.out.println("Vowels count "+count);
	}

}
