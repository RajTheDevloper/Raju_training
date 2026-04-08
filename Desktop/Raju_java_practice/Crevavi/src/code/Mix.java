package code;
import java.util.Scanner;

public class Mix {

	    public static void main(String[] args) {

	    //  exmp1();
	    // calculator();
	    pattern2();
	        
	    }

	    public static void exmp1(){
	        System.out.println("Enter the number to display in letter!");
	        Scanner input = new Scanner(System.in);
	        int number = input.nextInt();

	        input.close();

	        switch (number) {
	            case 1:
	                System.out.println("ONE");
	                break;
	            case 2:
	                System.out.println("TWO");
	                break;
	            case 3:
	                System.out.println("THREE");
	                break;
	            case 4:
	                System.out.println("FOUR");
	                break;
	            case 5:
	                System.out.println("FIVE");
	                break;
	        
	            default :
	            System.out.print("Done");
	                break;
	        }
	    }

	    public static void calculator(){
	        // Asking input and taking input from the user

	         Scanner input = new Scanner(System.in);
	        System.out.println("Enter the First number! ");
	        Double Fnum = input.nextDouble();
	        System.out.println("Enter the Second number! ");
	        Double Snum = input.nextDouble();
	        System.out.println("Enter the Operator(+, -, *, /, %) to perform the operation you desire!! ");
	        char op = input.next().charAt(0);

	        input.close();


	        switch (op) {
	            case '+':
	                
	                System.out.println(Fnum + Snum);
	                break;
	            case '-':
	                System.out.println(Fnum - Snum);
	                break;
	            case '*':
	                System.out.println(Fnum * Snum);
	                break;
	            case '/':
	                System.out.println(Fnum / Snum);
	                break;
	            case '%':
	                System.out.println(Fnum % Snum);
	                break;
	        
	            default:
	                break;
	        }

	    }

		public static void pattern2() {
			for (int j = 1; j <= 4; j++) {
				for (int i = 1; i <= 4; i++) {

					if (i == 1 && j == 2) {

						continue;
					}
					System.out.print(" " + "$");
				}
				System.out.println();
			}
		}

	}
