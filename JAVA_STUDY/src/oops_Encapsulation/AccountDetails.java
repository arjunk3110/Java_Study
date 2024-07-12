package oops_Encapsulation;

public class AccountDetails
{
	
	private int Account_Num;
	private String Name;
	private double Balance;
	
	
	public int getAccount_Num()
	{
		return Account_Num;
	}
	
	public void setAccount_Num(int account_Num)
	{
		Account_Num = account_Num;
	}
	
	
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		Name = name;
	}
	
	
	
	
	public double getTotal() 
	{
		return Balance;
	}
	public void setTotal(double total)
	{
		Balance = total;
	}
		
}
