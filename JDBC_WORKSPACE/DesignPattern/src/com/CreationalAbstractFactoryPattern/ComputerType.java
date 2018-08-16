package com.CreationalAbstractFactoryPattern;

public class ComputerType 
{
	private Computer comp;
	
	public static void main(String[] args)
	{
		ComputerType type=new ComputerType();
		
		Computer computer=type.getComputer("Server");
		System.out.println("Monitor: "+computer.getMonitor().getSpecification());
		System.out.println("RAM: "+computer.getRAM().getSpecification());
		System.out.println("Processor: "+computer.getProcessor().getSpecification());
		
		
	}

	public Computer getComputer(String computerType)
	{
		if(computerType.equals("PC"))
			comp=new PC();
			else if(computerType.equals("Workstation"))
				comp=new Workstation();
			else if(computerType.equals("Server"))
				comp=new Server();
		return comp;
	}
}