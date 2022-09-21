package com.training.task2;

public class UsingPrintString implements Runnable
{

	private String st1;
	private String st2;
	
	public UsingPrintString(String st1, String st2) {
		super();
		this.st1 = st1;
		this.st2 = st2;
		
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		PrintString.print(st1, st2);
	}
	
}
