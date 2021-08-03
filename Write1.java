package inputoutput;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Write1 {

	public static void main(String[] args) throws Exception {
	
		
		  FileWriter few = new FileWriter("D:/writer.txt");
		  PrintWriter pew = new	  PrintWriter(few);
		  
		  pew.println( " this"); pew.println("is "); pew.println("Business");
		  
		  pew.close();
		  
		  
		  
		  FileReader frd = new FileReader("D:/Testing.txt");
		  
		  FileWriter fwr = new FileWriter("D:/writer.txt",true);
		  int ja = frd.read();
		  
		  while (ja != -1) {
			  fwr.write(ja); 
			  ja = frd.read(); }
		  frd.close();
		  fwr.close();
		 	}

}
