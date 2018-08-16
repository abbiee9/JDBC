package com.CreationalSingletonPattern;

public class SingletonEx 
{
	private static SingletonEx se=null;
	private SingletonEx()
	{
	}
		public static SingletonEx getInstance()
		{
			if(se==null)
			{
				se=new SingletonEx();
				System.out.println("only once it will be printed");
			}
			return se;
		}
		public void sayHello()
		{
			System.out.println("hello");
		}
	
}
