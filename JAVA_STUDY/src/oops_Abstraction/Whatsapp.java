package oops_Abstraction;

public interface Whatsapp


{
	void call();	
	void mute();
	void disconnect();
	
}



class Audiocall implements Whatsapp
{
	@Override
	public void call()
	 {
        System.out.println("Please Call Audio  ");
	 }

	@Override
	public void mute() {
		System.out.println("Please Mute  Audio  ");
		
	}

	@Override
	public void disconnect() 
	{
		System.out.println("Please Disconnect Audio  ");
		
	}
}





class VideoCall implements Whatsapp
{
	@Override
	public void call()
	 {
		 System.out.println("Please Call Video  ");
	 }

	@Override
	public void mute() {
		System.out.println("Please Mute Video  ");
		
	}

	@Override
	public void disconnect()
	{
		System.out.println("Please Disconnect Video  ");
		
	}

}
