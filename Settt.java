package collectionss;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Settt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set tr = new TreeSet();
		 tr.add(56);
		 tr.add(546);
		 tr.add(78);
		 
		 System.out.println(tr);		
		
		 Set hs = new HashSet<>();
		 hs.add(89);
		 hs.add(56);
		 hs.add(8);
		 hs.add(97);
		 System.out.println(hs);
		 
		 Set lhs = new LinkedHashSet<>();
		 lhs.add(145);
		 lhs.add(97);
		 lhs.add(85);
		 lhs.add(6);
		 System.out.println(lhs);
		 		
		
		 
	}

}
