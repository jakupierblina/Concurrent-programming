public class PingPon extends Thread{
	

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
		//polimorfizem
		Thread t1 = new PingPon("Ping", 20);
		t1.start();

		Thread t2 = new PingPon("Pong", 20);
		t2.start();

	}
}