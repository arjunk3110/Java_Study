package oops_Abstraction;

public class InterfaceMain

{
	
	public static void main(String[] args)
	{
	
		Whatsapp AudioObj = new Audiocall();
		Whatsapp VideoObj = new VideoCall();
		
		AudioObj.disconnect();
		AudioObj.mute();
		AudioObj.call();
		
		VideoObj.disconnect();
		VideoObj.call();
		VideoObj.mute();
		
		

		
       
        
    
	}
	

}
