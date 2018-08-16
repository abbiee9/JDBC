package com.CreationalFactoryPattern;

public class AnimalFactory
{
	public Animal getAnimal(String type)
	{
		if("welcome".equals(type))
		{
			return new Dog();
		}
		else
		{
			return new Cat();
		}
	}
}
