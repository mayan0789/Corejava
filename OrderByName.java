package collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class OrderByName extends Marksheet2 implements Comparator<Marksheet2> {

	@Override
	public int compare(Marksheet2 y1, Marksheet2 y2) {
		
		if( y1.getFname().equals(y2.getFname())==true) {
			return y1.getLname().compareTo(y2.getLname());
		}
		else {
			return y1.getFname().compareTo(y2.getFname());
		}
	}

		}

		


