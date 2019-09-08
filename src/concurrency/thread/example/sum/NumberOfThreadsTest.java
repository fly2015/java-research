package concurrency.thread.example.sum;

import java.util.ArrayList;
import java.util.List;

public class NumberOfThreadsTest {
	public static void main(String[] args) 
	{
		new NumberOfThreadsTest().caculateSumWithMutilThreads();
		
	}
	
	private void caculateSumWithMutilThreads() {
		// We will store the threads so that we can check if they are done
        List<Thread> threads = new ArrayList<Thread>();
        
        // We will create 500 threads
		for (int i = 0; i < 500; i++) {
			Runnable task = new SumCaculateRunable(100);
			Thread worker = new Thread(task);
			// We can set the name of the thread
			worker.setName(String.valueOf(i));
			// Start the thread, never call method run() direct
			worker.start();
			// Remember the thread for later usage
            threads.add(worker);
        }
		
		int running = 0;
		do {
			running = 0;
			for (Thread thread : threads) {
				if (thread.isAlive()) {
					running++;
				}
			}
			System.out.println("We have " + running + " running threads. ");
		} while (running > 0);

	}
}