package in.co.rays;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int o = 20; int p = 80; 
		if(o>p) { System.out.println(" O is greater"); }
		else
			  { System.out.println(" P is Greater"); } 
		if (o<p) {
			  System.out.println(" O is smaller " ); }
		else {
			  System.out.println(" P is smaller "); }
		
		int arg0= 30;
		int arg1 = 5;
		
		 System.out.println("Minimum is " + Math.min(arg0, arg1));
		 
             System.out.println("Maximum is "+Math.max(arg0, arg1));
		 
             for( int i= 1; i<=5; i++)
  		   { for (int j=1; j<=i; j++)
  		    { System.out.print(" "+i); 
  		  } System.out.println(" "); }
  		         
			  
	}

}
