package collectionss;

import java.util.HashMap;
import java.util.Map;

public class Mapu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Map yu = new HashMap();
	
	yu.put(9, "Dhoom");
	yu.put(2, "Padmavat");
	yu.put(7, "Bhuj");
	yu.put(8,"Radhe");
	yu.put(6, 56);
	
	System.out.println(yu.get(2));
	System.out.println(yu.keySet());
	
	System.out.println(yu);
	
	
	}

}
