import java.util.concurrent.Semaphore;


class SharedBuffer 
{
	int cnt =0;
	Semaphore sem = new Semaphore(0);
	Semaphore cem = new Semaphore(1);


	public void put(int i)
	{
		try 
		{
			sem.acquire(); // producer semaphore taken
			//sem.release();
		}
		catch(InterruptedException ex)
		{
			System.out.println(ex);
		}
		cem = i;
		cem.release();
		System.out.println(Thread.currentThread().getName()+ " putting: " + i);

	}

	public int get()
	{

	}
}

class Produer implements Runnable
{

}


class Consumer implements Runnable
{

}

public class Conprod 
{
	public static void main (String [] args) throws InterruptedException
	{

	}
}