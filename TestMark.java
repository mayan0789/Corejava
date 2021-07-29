package collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestMark extends OrderByName {

	public static void main(String[] args) {
		
		List l = new ArrayList();

		Marksheet2 m1 = new Marksheet2();

		m1.setRollNo("789");
		m1.setFname("Aaju");
		m1.setLname("Jain");
		m1.setChemistry(25);
		m1.setMaths(78);
		m1.setPhysics(56);

		Marksheet2 m2 = new Marksheet2();
		m2.setRollNo("456");
		m2.setFname("Kaju");
		m2.setLname("Oberoi");
		m2.setChemistry(35);
		m2.setMaths(68);
		m2.setPhysics(96);

		Marksheet2 m3 = new Marksheet2();
		m3.setRollNo("123");
		m3.setLname("Mainu");
		m3.setFname("Baju");
		m3.setChemistry(75);
		m3.setMaths(18);
		m3.setPhysics(96);

		Marksheet2 m4 = new Marksheet2();

		m4.setRollNo("894");
		m4.setFname("Baju");
		m4.setLname("Lakhan");
		m4.setChemistry(15);
		m4.setMaths(98);
		m4.setPhysics(53);

		Marksheet2 m5 = new Marksheet2();

		m5.setRollNo("246");
		m5.setFname("Baju");
		m5.setLname("Pratap");
		m5.setChemistry(95);
		m5.setMaths(93);
		m5.setPhysics(8);
		
		
		Marksheet2 m6 = new Marksheet2();

		m6.setRollNo("356");
		m6.setFname("Taju");
		m6.setLname("Naalak");
		m6.setChemistry(35);
		m6.setMaths(73);
		m6.setPhysics(48);

		
		

		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		l.add(m5);
		l.add(m6);
	

		System.out.println();

		Collections.sort(l, new OrderByName());

		Iterator it = l.iterator();

		while (it.hasNext()) {

			Object o = it.next();
			String tru = o.toString();
			System.out.println(tru);

		}

	}

}
