package com.CreationalSingletonPattern;

public class SingletonTest 
{
	public static void main(String[] args) 
	{
		SingletonEx se=SingletonEx .getInstance();
		SingletonEx se1=SingletonEx .getInstance();
		se.sayHello();
		se1.sayHello();
	}
}
