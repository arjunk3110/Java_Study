package Keyword;


class Parent_White
{
	String colour="White";
	
	void driving()
	{
		System.out.println("Parents are driving cars");
	}

}


class Child extends Parent_White

{
	String colour="Black";
	
	void display()
	{
		System.out.println(super.colour);
	}

	void driving()
	{
		//System.out.println("Childrens are driving cycle");
		super.driving();
	}
	
	
}
	


public class SuperKeyword {

	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.display();
		obj.driving();
	}
}
