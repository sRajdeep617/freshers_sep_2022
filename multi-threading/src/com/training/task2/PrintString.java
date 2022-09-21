package com.training.task2;

public class PrintString {
	public static void print(String st1,String st2)
	{
		System.out.println(st1);
		
		try
		{
			Thread.sleep(200);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(st2);
	}
}
