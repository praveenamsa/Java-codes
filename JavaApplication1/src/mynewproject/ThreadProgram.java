package mynewproject;

public class ThreadProgram extends Thread 
{    
	 public static int amount = 2;
	public static void main(String[] args) 
	{ 
		ThreadProgram tp = new ThreadProgram();
		//Thread thread = new Thread(tp);
		tp.start();
                
		while(tp.isAlive())
		{
			System.out.println("Waiting !!!");
		}
		System.out.println(amount);
		amount++;
		System.out.println(amount);		
	}
	public void run()
	{
		amount++;
		
	}

}
