package com.demo.beans;

import java.time.LocalDate;

public class Utility {
	public void getSystemDate()
	{
		LocalDate now = LocalDate.now();
		System.out.println(now);
	}
	
	public void m1()
	{
		System.out.println("M1() of Utility class and ----");
    }
	public void m2()
	{
		System.out.println("M2() of Utility class and ----");
    }
}
