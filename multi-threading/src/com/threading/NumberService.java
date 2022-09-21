package com.threading;

public class NumberService {
	public NumberService()
	{
		super();
	}
	
	public int sumNumbers(int countTo)
	{
		int sum = 0;
		for (int i = 0; i <= countTo; i++)
			sum += i;
		
		System.out.println("Current thread: " + Thread.currentThread().getName());
		return sum;
	}
	
	
}
