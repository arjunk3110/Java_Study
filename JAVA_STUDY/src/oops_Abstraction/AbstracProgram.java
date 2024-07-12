package oops_Abstraction;



public class AbstracProgram 
{
	
	public static void main(String[] args)
	{
	
	hpmodel model= new hpmodel();
	model.turnon();
		
	}	
	
	
}

abstract class computer
{
	abstract void turnon();
	
}



class hpmodel extends computer
{
	
	void turnon()
	{
		System.out.println("DELL ON COMPUTER");
	}
}

