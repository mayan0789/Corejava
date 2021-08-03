package inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializeWorkers {

	public static void main(String[] args) throws Exception {
		FileInputStream input = new FileInputStream("D:/try.ser");
		ObjectInputStream out = new ObjectInputStream(input);

		Workers wer = (Workers) out.readObject();
		Workers wot = (Workers) out.readObject();
		Workers wqe = (Workers) out.readObject();
		
		System.out.println("---------------First Employee---------------");

		System.out.println("ID : " + wer.getId());
		System.out.println("Name : " + wer.getName());
		System.out.println("Surname : " + wer.getSurname());
		System.out.println("Code is : " +wer.getCode());
		
		System.out.println();
		System.out.println("---------------Second Employee---------------");
		System.out.println();
		System.out.println("ID : " + wot.getId());
		System.out.println("Name : " + wot.getName());
		System.out.println("Surname : " + wot.getSurname());
		
		System.out.println();
		System.out.println("---------------Third Employee---------------");
		System.out.println();
	
		System.out.println("ID : " + wqe.getId());
		System.out.println("Name : " + wqe.getName());
		System.out.println("Surname : " + wqe.getSurname());
		
		out.close();
	}

}
