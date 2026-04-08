package code;

class Hii implements Runnable
{
	public void run() {
		for(int i = 0; i < 4; i++) {
			
			System.out.println("HI");
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}

class Helloo implements Runnable
{
	public void run() {
		for(int i = 0; i < 4; i++) {
			
			System.out.println("Hello");
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}
public class ThreadUsingRannable {

	public static void main(String[] args) {
		
//		here reference we can have Runnable interface but object must be the class object
//		Hii obj1 = new Hii();
		Runnable obj1 = new Hii();
//		Helloo obj2 = new Helloo();
		Runnable obj2 = new Helloo();
		
//		We have to create object of thread class 
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		
		t1.start();
		t2.start();
	}
}

