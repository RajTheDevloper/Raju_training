package code;

public class ThreadUsingLamda {

	public static void main(String[] args) throws Exception {
		
//		Now using lamda and ananymous class we can create the object of the RUnnable interface
//		THiS IS ANANYMOUS CLASS DEMO
		Runnable obj1 = new Runnable() {
			public void run() {
				for(int i = 0; i < 4; i++) {
					
					System.out.println("HI" + Thread.currentThread().getPriority());
					try{Thread.sleep(500);}catch(Exception e){}
				}
			}
		};
//		THiS IS LAMDA EXPRESSION DEMO
//		Runnable obj2 = () -> {
//				for(int i = 0; i < 4; i++) {
//					
//					System.out.println("Hello");
//					try{Thread.sleep(500);}catch(Exception e){}
//				}
//			};
		
//		We have to create object of thread class 
		Thread t1 = new Thread(obj1);
//		Thread t1 = new Thread(obj2);
		
		
//		because we are using the method only once we can directly add it over here in the thread constructor.
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 4; i++) {
				
				System.out.println("Hello");
				try{Thread.sleep(500);}catch(Exception e){}
			}
		}, "Thread name we can give it here");
		
		
		t1.getName();
		t2.getName();
		
		t1.setName("hi");
		t2.setName("hello");
		
		t1.getPriority();
		t2.getPriority();
		
		t1.setPriority(1);
		t2.setPriority(10);
		
//		or we can use some inbuilt constants to set priority for the thread
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
//		Thread.currentThread().getPriority();
		
		
//		This isAlive() method is used to check whether the thread is alive or not it will return true or false.
		System.out.println(t1.isAlive()); //here it's giving false 
		
		
		t1.start();
//		System.out.println(t1.isAlive()); //here it's giving true 
		t2.start();
		
//		'Join' we use it for make main thread to wait until the ti & t2 thread is finished.
		t1.join();
		t2.join();
		
		System.out.println("Main starts now after t1 and t2");
	}
}

