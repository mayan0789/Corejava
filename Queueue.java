package collectionss;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue qt = new PriorityQueue<>();
		qt.offer("Z");
		qt.offer("X");
		qt.add("I");
		qt.add("B");
		qt.add("A");
		System.out.println(qt);

		Queue yr = new LinkedList<>();
		yr.add(87);
		yr.add("Demon");
		yr.add(75);
		yr.add(9);
		System.out.println(yr);
		yr.poll();
		System.out.println(yr);

		Deque ot = new ArrayDeque<>();
		ot.offer(78);
		ot.offer(45);
		System.out.println(ot);

		ot.addFirst(13);
		ot.add(79);
		ot.pollLast();
		
		System.out.println(ot);

	}

}
