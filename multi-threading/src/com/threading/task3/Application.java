package com.threading.task3;

public class Application {
	public static void main(String args[]) 
	{
		BankAccount ob = new BankAccount(1000);
		Thread firstThread = new Thread()
				{
					@Override
					public void run()
					{
						System.out.println("Balance after withdrawl = " + ob.withdraw(5000));
					}
				};
				
		firstThread.start();
		
		Thread secondThread = new Thread()
		{
			@Override
			public void run()
			{
				System.out.println("Current Balance = " + ob.deposit(7000));
			}
		};
		
		secondThread.start();
	}
}
