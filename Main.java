import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.*;


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		Thread1 fetchData = new Thread1();
        Future future = executor.submit(fetchData);
		Thread2 processData = new Thread2();
		Thread thread = new Thread(processData);
		
		//fetchData.start();
		try {
            future.get(10000, TimeUnit.MILLISECONDS);
            fetchData.join();
		} catch(Exception e) {
            future.cancel(true);
            System.out.println("Terminated!, time limit exeed for fetchData");
		}
		thread.start();
		
	}
}

class Thread1 extends Thread{
    private void fetchData (){
        
        try {
            int sec = 5000;
            this.sleep(sec);
            System.out.println("fetch data has been called after " + sec);
        } catch(Exception e) {
    }

    }
    
    public void run (){
        fetchData();
    }
}

class Thread2 implements Runnable{
    public void run (){
        System.out.println("Process data has been called");
    }
}