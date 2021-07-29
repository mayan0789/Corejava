package collectionss;

import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class Listtt {

	public static void main(String[] args) {

		List k = new LinkedList();
		k.add('A');
		k.add('B');
		k.add(31);
		k.add(4);
		k.add(5.9);
		k.add(6.4);
		k.add(7.56f);
		k.add("ThisOne");
		k.add("ThatOne");
		
		System.out.println(k);

		Iterator uy = k.iterator();
		
		while(uy.hasNext()) {
			System.out.println(uy.next());
		}
		
		System.out.print(uy);
		
		System.out.println(k);
		k.remove(6.4);

		for (Object ot : k) {
			//System.out.println(ot);
		}

		List d = new ArrayList();
		d.add('C');
		d.add(31);
		d.add(6.59);
		d.add("AnotherOne");
		System.out.println(d);

		d.removeAll(k);

		System.out.println(d);
		/*
		 * d.addAll(k); System.out.println(d); System.out.println(d.retainAll(k));
		 * System.out.println(d);
		 * 
		 * System.out.println(d.contains(6.59)); System.out.println(d.containsAll(k));
		 * System.out.println(d.isEmpty()); System.out.println(k);
		 * 
		 * System.out.println(d.size());
		 * 
		 * k.add(3, "adda"); System.out.println(k); System.out.println(k.get(2));
		 * k.remove(4); System.out.println(k); System.out.println(d);
		 * 
		 * d.set(8, "Change"); System.out.println(d);
		 * 
		 * System.out.println(d.subList(4, 9)); System.out.println(d.indexOf(3));
		 * System.out.println(d.lastIndexOf("ThisOne"));
		 * 
		 * System.out.println(d.retainAll(k));
		 * 
		 * d.removeAll(k); System.out.println(d);
		 * 
		 * d.clear(); System.out.println(d);
		 * 
		 * List t = new LinkedList();
		 * 
		 * t.add("Trim"); t.add("Nobject"); System.out.println(t.get(0));
		 */
		Stack po = new Stack<>();
		po.push(58);
		po.add(45);
		po.push("Storm");

		System.out.println(po.peek());

		System.out.println(po);

	}

}
