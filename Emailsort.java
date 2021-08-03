package inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Emailsort {

	public static void main(String[] args) throws Exception {
		
		/*
		 * FileReader fr = new FileReader("D:/email.txt"); BufferedReader br = new
		 * BufferedReader(fr); String line = br.readLine();
		 * 
		 * 
		 * while (line.) {
		 * 
		 * System.out.println(line); line = br.readLine(); }
		 */
		/*
		 * String str = "java49@mail.com"; StringTokenizer stn = new
		 * StringTokenizer(str,"@"); String token = null;
		 * 
		 * while(stn.hasMoreElements()) { if (str.contains("@gmail.com")) {
		 * 
		 * token = stn.nextToken(); System.out.println(" token is  "+token); }}
		 ||line.contains("@yahoo.com")||line.contains("@rediif.com")||line.contains("@hotmail.com")
		 */
		FileReader fr = new FileReader("D:/email.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();

		while (line != null) {
			if(line.contains("@gmail.com")) {
			System.out.println(line);
		line = br.readLine();
		}
			
			  else if(line.contains("yaaho.com")) 
			  {
				  System.out.println(line); 
			 line =  br.readLine();
			  }
		
			  else if(line.contains("hotmail.com")) 
			  { 
				  System.out.println(line); 
			  line =  br.readLine(); }
			  else if(line.contains("rediff.com")) 
			  { 
				  System.out.println(line); 
			  line =  br.readLine();
			  } else {
			//System.err.println("Wrong Email id : "+line);
			line = br.readLine();
			  }}
System.out.println(Pattern.matches("[a-zA-Z0-9]","S5"));
		br.close();
	
	}

	}


