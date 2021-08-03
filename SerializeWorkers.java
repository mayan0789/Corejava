package inputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeWorkers {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("D:/try.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Workers work = new Workers(56, "Naam", "Puranam", "abcd");
		Workers wok = new Workers(53, "Kya", "Pata", "bcd");
		Workers wrk = new Workers(59, "Suna", "Hoga", "abd");

		oos.writeObject(work);
		oos.writeObject(wok);
		oos.writeObject(wrk);
		oos.close();
		System.out.println("Completed");

	}

}
