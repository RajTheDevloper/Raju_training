package code;

class demo{
	
	int count;
	public void increment() {
		count++;
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) throws Exception{
		
		demo d = new demo();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i < 1000; i++) {
					d.increment();
				}
			}
		});
		
		t1.start();

	}

}
