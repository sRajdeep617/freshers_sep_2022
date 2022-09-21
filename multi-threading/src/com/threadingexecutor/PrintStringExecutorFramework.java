package com.threadingexecutor;

public class PrintStringExecutorFramework {
		public static synchronized void print(String st1,String st2)
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

