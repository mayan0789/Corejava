package inputoutput;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;


public class Emailop {
	
	

		public static boolean isVaild(String line) throws Exception {

			String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
					+ "A-Z]{2,7}$";

			Pattern pat = Pattern.compile(emailRegex);
			if (line == null) {
				return false;
			}
			return pat.matcher(line).matches();
			

		}

		public static void main(String[] args) throws Exception {

			FileReader frr = new FileReader("D:/email.txt");
			BufferedReader brr = new BufferedReader(frr);

			String line = brr.readLine();
			

			//isVaild(line, brr);
			while (line!=null) {
	            if(isVaild(line)) {
	            	System.out.println(line);
			    line = brr.readLine();
			}else {
				line = brr.readLine();
			}
			
	    }brr.close();

		}}

