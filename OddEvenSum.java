package in.co.rays;

public class OddEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Even Series");
		  for (int k = 1; k<=50; k++) {
			  while ( k%2==0) {
				
				 System.out.print(" "+k+" ");
				   break;
		  
		  } }
		  System.out.println();
		  System.out.print("Odd"
		  		+ " Series");

		  for (int k = 1; k<=50; k++) {
			  while ( k%2!=0) {
			 System.out.print(" "+k+" ");
			 break;
	}}
		  System.out.println();
		

int n =100; int sum=0,sum1=0; for (int i =1; i<=n; i++)
{ if (i%2==0) { 
	  sum =	  sum+i; } 
else { sum1 = sum1 +i; }

} System.out.println("Sum of Odd No. is " + sum);
System.out.println("Sum of Even no. is  " + sum1);
		
int sum2 =0, sum3=0;
for (int k = 1; k<=100; k++) {
	  while ( k%2!=0) {
			 sum2 = sum2+k;
		 	  break; }
	  while ( k%2==0) {
			 sum3 = sum3+k;
		 	  break; }
	  
	  } 
System.out.print("Sum of odd "+sum2+" sum of even " +sum3);


	}

}
