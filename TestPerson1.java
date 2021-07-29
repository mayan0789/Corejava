package construv;

import java.text.ParseException;

public class TestPerson1 {

	public static void main(String[] args) throws ParseException  {
		// TODO Auto-generated method stub
	Person1 po = new Person1("Madagascar");
	
	Person1 io = new Person1("Despicable", "Me");

	Person1 p = new Person1("Kung fu ", " Panda " , "Umrikka" ,"02/02/2020");
		
	    
	    
		System.out.println("The only First Name is --" + po.getFirstname());
		
		System.out.println("The First name and Last name is -- "+io.getFirstname()+" "+io.getLastname());
		  					 
		System.out.println("The name is --" + p.getFirstname()+p.getLastname());
		System.out.println("The location is -- "+p.getAddress());
		 System.out.println("The DOB is --" +  p.getDOB()); 
	}
	

}
