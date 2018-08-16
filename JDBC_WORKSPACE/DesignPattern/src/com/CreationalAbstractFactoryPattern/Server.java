package com.CreationalAbstractFactoryPattern;

public class Server extends Computer
{
	public Parts getRAM()
	{
		return new Parts("4 gB");
	}
	public Parts getProcessor()
	{
		return new Parts("Intel P 4");
	}
	public Parts getMonitor()
	{
		return new Parts("17 inches");
	}
}
