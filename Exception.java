package construv;

public class Exception {

	public static void main(String[] args) {
            try {	
	             double h = 9 / 0;
			     System.out.println(h);
			try {
				String j = "grin";
				j.charAt(9);
			} catch (StringIndexOutOfBoundsException o) {
				System.out.println("jhalla");}
            } catch (ArithmeticException k) {
			    System.out.println("Challa");
		    } finally {
			    System.out.println(" ");
	        	}}}