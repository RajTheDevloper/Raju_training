package code;

import java.util.*;

public class CollectionDemo {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		List values = new ArrayList();
		values.add(4);//this are are objects not values 
		values.add(6);
		values.add(9);
		values.add(1, 2);
//		Iterator it = values.iterator();
//		System.out.println(it.next());
		
		for(int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));
		}
		
//		Using forEach loop we can achieve the same output
		for(Object o : values) {
			System.out.println(o);
		}
	}
}
	