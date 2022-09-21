package com.threading;

public class NumberSrviceTask implements Runnable{ // 1 -> implements runnable 
	private String name;
	private NumberService service;
	private int countTo;
	
	public NumberSrviceTask(String name, int countTo) {
		super();
		this.name = name;
		this.service = new NumberService();
		this.countTo = countTo;
		
		Thread thread =  new Thread(this, name); // 2 -> pass runnable to thread constructor
		thread.start(); // 3 -> make the thread runnable by invoking start
	}
	
	@Override
	public void run()
	{
		System.out.println(this.service.sumNumbers(countTo)); // 4 -> the code that should run as a thread
	}
	
	
}
