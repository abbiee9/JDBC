package com.CreationalAbstractFactoryPattern;

public class Workstation extends Computer
{
	public Parts getRAM()
	{
		return new Parts("1 GB");
	}
	public Parts getProcessor()
	{
		return new Parts("Intel P 3");
	}
	public Parts getMonitor()
	{
		return new Parts("19 inches");
	}
}
