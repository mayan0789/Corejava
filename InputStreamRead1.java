package inputoutput;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputStreamRead1 {

	public static void main(String[] args) throws Exception {
		FileWriter dir = new FileWriter("D:/writer.txt",true);
		PrintWriter writer =new PrintWriter(dir);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader brd = new BufferedReader(isr);
		
		System.out.println("Type matter from here......");
		String lines = brd.readLine();
		while(!lines.equalsIgnoreCase("exit")) {
			writer.println(lines);
		lines = brd.readLine();
		}
		
		
writer.close();
isr.close();
	}

}
