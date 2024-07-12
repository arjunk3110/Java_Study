package Keyword;



class A
{
	final  int s=100;
	
	final public void show()
	{
	 System.out.println("Showing Parents-Class A");
	}
}


class B extends A
{
	public void show1()
	{
	 System.out.println("Showing Child-Class B");
	}
}


public class FinalKeyword {

	public static void main(String[] args) 
	{
		A obj= new A();
		System.out.println(obj.s);
		obj.show();

	}

}
