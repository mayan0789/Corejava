package inputoutput;

import java.io.FileReader;
import java.io.FileWriter;

public class Ssplit {

	public static void main(String[] args) throws Exception {
		

	String target = "D:/try.txt";
	String other = "D:/writer.txt";
		FileReader frd = new FileReader(target);
		FileReader frd2= new FileReader(other);

		FileWriter fwr = new FileWriter("D:/merge.txt");
		
		int count2 = frd2.read();
		
		int count = frd.read();

		while (count != -1|| count >0) {
			if(count!=-1) {
		      fwr.write(count);
			 count = frd.read();
			}
			 else if(count2!=-1) {
				 fwr.write(count2);
				 count2= frd2.read();
			 }
		}
		frd.close();
		fwr.close();
		}

	}


