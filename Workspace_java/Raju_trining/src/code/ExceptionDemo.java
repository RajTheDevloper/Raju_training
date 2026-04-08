package code;

public class ExceptionDemo {
	public static void main(String[] args) {
		
		try {
			
			int num1 = 10;
			int num2 = 0;
			int rel = num1 / num2;
			System.out.println(rel);
		}
//		catch(Exception e){
//			System.out.println(e);
//		}
		
//		catch(ArithmeticException e){
//			System.out.println(e);
//		}

		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println(e);
//			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("FINISHED EXECUTION!!");
		}
	}
}
