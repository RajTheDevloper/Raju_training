package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



//import java.util.*;

public class GenericDemo {
	
	public static void main(String[] args) {

		
//		Generic is type specific and type safe unlike collections 
		List<Integer> values = new ArrayList<>();
		values.add(4);//this are are objects not values 
		values.add(6);
		values.add(1);
		values.add(1, 2);
		
//		These are the Collections methods 
		Collections.sort(values);
		Collections.reverse(values);
		Collections.shuffle(values);
		
		
		for(Integer o : values) {
			System.out.println(o);
		}
	}
}
