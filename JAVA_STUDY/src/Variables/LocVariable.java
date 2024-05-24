package Variables;

public class LocVariable
{
	
	
	void methodname() {
		 int LocalVariable = 250;
        System.out.println("Local variable  " + LocalVariable);
    }
	
	 public static void main(String[] args)
	 {
		  int LocalVariable1 = 300;
	       System.out.println("Local variable inside main method: " + LocalVariable1);
	        
	        
	        LocVariable obj=new LocVariable();
	        obj.methodname();
	    }
}
