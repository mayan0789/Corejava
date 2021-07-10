package in.co.rays;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=5; i++) {
      	int m = (int) (Math.random()*100); 
       	System.out.print(" "+m);
         }
		System.out.println();
		
		int num = 67298, reve=0;
		  do { 
			  int rem = num%10; 
			  reve = reve*10 + rem;
			  num =  num/10; } 
		  while (num >0);
		  
		  System.out.println("The reverse of given number is " +reve);
		
		
		
		int i=1; int f=1;
	    int number=9;
  for(i=1;  i<=number; i++) 
  
  {f=f*i;}
  
  System.out.println( "The factorial of " + number +" is " +f);
  
	}

}
