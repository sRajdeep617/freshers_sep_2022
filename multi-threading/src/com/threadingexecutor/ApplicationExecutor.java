package com.threadingexecutor;

import java.util.concurrent.*;

import java.util.concurrent.Executors;

import com.training.task2.UsingPrintString;

public class ApplicationExecutor {
	public static void main(String[] args)
	{
		ExecutorService service = Executors.newSingleThreadExecutor(); // italics means static
		UsingPrintStringExecutorFramework[] tasks = 
			{
			new UsingPrintStringExecutorFramework("Idli", "sambhar"),
			new UsingPrintStringExecutorFramework("Pizza", "Coke"),
			new UsingPrintStringExecutorFramework("Paratha", "Dahi"),
			new UsingPrintStringExecutorFramework("Bread", "Butter")
			};
		
		for (UsingPrintStringExecutorFramework eachTask: tasks)
		{
			service.submit(eachTask);
		}
		service.shutdown();
	}
}
