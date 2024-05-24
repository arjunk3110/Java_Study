package oops_Abstraction;

public class InterfaceMain implements shape

{
	
	public static void main(String[] args)
	{
		InterfaceMain obj= new InterfaceMain();
		obj.circle();
		obj.square();
		shape.triangle();
	
		
	}
	
	public void circle()
	{
		System.out.println("This is Abstract  method-CIRCLE");
		
	}	
	
}
