class CostumThread extends Thread 
{
	public CostumThread (String name)
	{
		//this.name=name;
		super(name);
	}

	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println(getName()); //printing the thread name
		}
	}
}

public class Yeldtest
{
	public static void main(String[] args)
	{
		Thread t = new CostumThread("C1");
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();

		for(int i=0; i<10; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}


}