package code;

class Demo{
	
	private int rollNumber;
	private String name;
	
//	getter and setter demo( wrapping up the data with method)
	public void setRollNumber(int r) {
		rollNumber = r;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.setRollNumber(10);
		int roll = obj.getRollNumber();
		System.out.println(roll);
		
		obj.setName("Raju");
		System.out.println(obj.getName());
	}
}
