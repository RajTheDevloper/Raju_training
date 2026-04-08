package code;

public class VarargsDemo {
	public static void main(String[] args) {
		
		System.out.println(calc(1,2,3,4,5,6,7)); //we can give as many number of argumets we can
		
	}
	
//This is a static method so we don't need to create an object for it.
public static int calc(int ... n){ //varargs 
		
		int sum = 0;
		for(int i : n) { //foreach or Enhanced for loop
			sum = sum + i;
		}
		return sum;
		
	}

}
