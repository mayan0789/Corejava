package in.co.rays;

public class StringName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = " Maicheal John Smith";
	      for ( int m= name.lastIndexOf(" "); m<name.length(); m++) {
	  		
				 System.out.print(name.charAt(m));
				 
			}
			System.out.println();
			{String arr[] = name.split(" ");
			String last = arr[arr.length-1];
			System.out.println("Last name is " + last);
			}
			for (int j= name.length();j>0; j--) {
				System.out.print(name.charAt(j-1));
								}
			System.out.println();
			
			String str= " Miachel Smith John";
			String arr[]= str.split(" ");
			for (int i =0; i<arr.length;i++) {
				for (int j=arr[i].length()-1;j>=0;j--)
{
System.out.print(arr[i].charAt(j));
}
				System.out.print(" ");
}

				
				
				
			}
				}
		

	


