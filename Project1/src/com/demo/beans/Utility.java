package com.demo.beans;

import java.time.LocalDate;

public class Utility {
	public void getSystemDate()
	{
		LocalDate now = LocalDate.now();
		System.out.println(now);
	}
}
