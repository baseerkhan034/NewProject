package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainProcess extends Thread implements Runnable{
	
	public static void main(String[] args) throws Exception {
	
		/*Thread t1 = new Thread(new SMSAlert());
		
		
		Thread t2 = new Thread(new EmailAlerts());
		
		
		Thread t3 = new Thread(new NotificationAlert());
		
		//t1.sleep(1000);
		t1.start();
		//t2.sleep(1000);
		t2.start();
		//t3.sleep(1000);
		t3.start();*
		 */
		
		//ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newFixedThreadPool(5);
		//ExecutorService executor = Executors.newCachedThreadPool();
		
		Runnable task1 = new SMSAlert();
		Runnable task2 = new EmailAlerts();
		Runnable task3 = new NotificationAlert();
		executor.execute(task1);
		executor.execute(task2);		
		executor.execute(task3);
		
		executor.execute(task1);
		executor.execute(task2);		
		executor.execute(task3);
		executor.execute(task1);
		executor.execute(task2);		
		executor.execute(task3);
		executor.execute(task1);
		executor.execute(task2);		
		executor.execute(task3);
		executor.execute(task1);
		executor.execute(task2);		
		executor.execute(task3);
		executor.execute(task1);
		executor.execute(task2);		
		executor.execute(task3);
		executor.execute(task1);
		executor.execute(task2);		
		executor.execute(task3);
		
		executor.execute(task1);
		executor.execute(task2);		
		executor.execute(task3);

		executor.execute(task1);
		executor.execute(task2);		
		executor.execute(task3);
		
		executor.execute(task1);
		executor.execute(task2);		
		executor.execute(task3);
		
		executor.execute(task1);
		executor.execute(task2);		
		executor.execute(task3);
		
		
		
	}

}
