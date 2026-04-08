package code;

/*
 *	According to our calculation our count should be 200 but we are getting some 159 something 	
	The problem is that the thread is not "synchronized" and the method is not thread safe.
	what we can do her is that we can make our working method thread safe by making that method Synchronized.
 
 * 
 * 
 * 
 */

//class DemoF{
//	
//	int count;
////	Synchronization
//	public synchronized void increment() {
//		count++;
//	}
//}
//
//public class Synch_Demo {
//
//	public static void main(String[] args) throws Exception{
//		
//		DemoF d = new DemoF();
//		
//		Thread t1 = new Thread(new Runnable() {
//			public void run() {
//				for(int i = 0; i < 100; i++) {
//					d.increment();
//				}
//			}
//		});
//		
//		Thread t2 = new Thread(new Runnable() {
//			public void run() {
//				for(int i = 0; i < 100; i++) {
//					d.increment();
//				}
//			}
//		});
//		
//		
//		t1.start();
//		t2.start();
//		
//		t1.join();
//		t2.join();
//		
//		System.out.println(d.count);
//
//	}
//
//}
