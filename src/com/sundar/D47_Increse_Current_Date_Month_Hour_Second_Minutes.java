package com.sundar;

import java.util.Calendar;

public class D47_Increse_Current_Date_Month_Hour_Second_Minutes {
	public static void main(String[] args) {
		
		Calendar now=Calendar.getInstance();
		
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		now.add(Calendar.HOUR_OF_DAY, 2);
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		
	}

}
