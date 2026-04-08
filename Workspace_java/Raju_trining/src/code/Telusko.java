package code;

public class Telusko {
	public static void main(String[] args) {
		
		
		

		int a[] = { 1, 2, 3 };

		for (int i : a) { // Enhanced for loop or for_each loop
			System.out.print(" " + i);
			System.out.println();
		}

//		Two dimensional array
		int d[][] = { { 1, 2, 3, 4 }, { 5, 6, 7 }, //jagged array

				{ 8, 9, 10, 11, 12, 13 } };
		
		for(int k[] : d) {
			for(int l : k) {
				System.out.print(" " + l);
			}
			System.out.println();
		}
		
	}
}
