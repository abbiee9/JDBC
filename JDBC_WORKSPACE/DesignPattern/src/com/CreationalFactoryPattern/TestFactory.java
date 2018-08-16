package com.CreationalFactoryPattern;

public class TestFactory 
{
	public static void main(String[] args)
	{
		AnimalFactory af=new AnimalFactory();
		
		Animal a1=af.getAnimal("welcome");
		System.out.println("a1 sound: "+a1.makeSound());
		
		Animal a2=af.getAnimal("hello");
		System.out.println("a2 sound: "+a2.makeSound());
	}
}
