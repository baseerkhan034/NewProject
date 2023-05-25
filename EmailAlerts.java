package Threads;

public class EmailAlerts extends Thread implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i<4; i++) {
	System.out.println("Email");
	}
	}

}
