package oops_Encapsulation;

public class AccountMain 
{
	
	public static void main(String[] args)
	{
		
		AccountDetails obj = new AccountDetails();
		obj.setName("Arjun");
		obj.setAccount_Num(101);
		obj.setTotal(100000);
	
		
		
		System.out.println(obj.getName());
		System.out.println(obj.getAccount_Num());
		System.out.println(obj.getTotal());
		
	}
	
}
