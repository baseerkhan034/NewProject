package Threads;

public class SMSAlert extends Thread implements Runnable{
	
	@Override
	public void run() {
		for(int k = 0; k<5; k++) {
	System.out.println("SMS alert");
	}
}
}