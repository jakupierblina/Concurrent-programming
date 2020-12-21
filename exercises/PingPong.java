public class PingPong implements Runnable{
	

	private String word;
	private int delay;

	public PingPon(String word, int delay){
		this.word = word;
		this.delay = delay;
	}


	//add a delay
	public void run(){
		try{
			//run this much time
			for(int i=0; i<20; i++){
				System.out.println(word);
				Thread.sleep(delay); //static method 
			}
		}catch(InterruptedException ex){
			return;
		}
	}
	

	public static void main(String [] args){
		//polimorfizem n runable method

		PingPong ping = new PingPong("Ping", 30);
		Runnable pong = new PingPong("Pong", 30);


		PingPong t1 = new Thread(ping);
		t1.start();

		Thread t2 = new Thread(pong);
		t2.start();


		

	}
}