package com.threadingexecutor;
public class UsingPrintStringExecutorFramework implements Runnable{
	private String st1;
	private String st2;
	
	public UsingPrintStringExecutorFramework(String st1, String st2) {
		// TODO Auto-generated constructor stub
		super();
		this.st1 = st1;
		this.st2 = st2;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		PrintStringExecutorFramework.print(st1, st2);
	}
}
