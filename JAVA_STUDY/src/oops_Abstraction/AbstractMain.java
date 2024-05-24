package oops_Abstraction;

public class AbstractMain extends AbstractDemo
{

	public static void main(String[] args)
	{
	
		AbstractMain obj = new AbstractMain();
		obj.credit();
		obj.loan();
		
	}

	void loan()
	{
		 System.out.println("Bank Loan");	
	}

	
	
}
