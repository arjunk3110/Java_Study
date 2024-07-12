package oops_Polymorphism;

public class MethodOverLoading 
{
	
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	
	void sum(int a,double b)
	{
		System.out.println(a+b);
	}
	
	
	public static void main(String args[])
	{
		MethodOverLoading obj= new MethodOverLoading();
		obj.sum(2, 10);
		obj.sum(10,5.5);
		
	}

}
