package multithreading;

public class ThreadingSynchronization extends Thread {
	
	
	synchronized public void alphabet(){
		char[] a = {'a','e','i','o','u'};

		for(char e:a){
			System.out.print(e);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getPriority());
	}
	

	public static void main(String[] args) {
		ThreadingSynchronization t1=new ThreadingSynchronization();
		new Thread(){
			public void run(){
				Thread.currentThread().setPriority(7);
				t1.alphabet();
				
			}
		}.start();
		new Thread(){
			public void run(){
				Thread.currentThread().setPriority(3);
				t1.alphabet();
				
			}
		}.start();
	}
}
