package oops_Abstraction;


interface shape
{
	int length=10;  //Final and static
	int width=20;	//Final and static
	
	default void square()								//Default method
	{
		System.out.println("This is default method");
	}

	abstract void circle();								//Abstract method
	
	
	static void triangle()								//Static method
	{
		System.out.println("This is static method- Triangle");			
	}
	

}


