package in.co.rays;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 1; 
	    while  (r<10) {
	    	System.out.println(r + " Really");
	    	r++;
	    }
	    int i = 1;
	    do {
	    	System.out.println(i + " Hello");
	    	i++;
	    } while (i<6);

	    	   
        int num=8;
        
        String evenOdd=(num%2==0)?"Even":"Odd";
        
        System.out.println( "  8 even or odd = " + evenOdd);

        int in = 1987;
        if (in%2==0) 
        { System.out.println(in + " I am an even number");}
        else
        { System.out.println(in + " I am an odd number");
        }

	}

}
