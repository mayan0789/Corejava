package construv;

public class TestAutomobile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Automobile1 am = new Automobile1();
Automobile1 ab = new Automobile1 ("Black&White");
Automobile1 ac = new Automobile1 ("Blue&Red "," Hyundai");
	
		System.out.println(" The Color of Car is :"+am.getColor());
		System.out.println(" The Making of Car is done by :"+am.getMake());
		
        System.out.println("Increasing your speed to --- "+ab.accelerator(4));
		
	    System.out.println("The speed of this car is :" + ab.getSpeed());
	    
		System.out.println("Decreasing your speed to --- "+ab.brake(2));
		 
	    System.out.println("The speed of this car is :" + ab.getSpeed());
	    
		System.out.println("Increasing your speed to --- "+ab.accelerator(2));
		
	    System.out.println("The speed of this car is :" + ab.getSpeed());
	    
	    System.out.println("Decreasing your speed to --- "+ab.brake(2));
		 
	    System.out.println("The speed of this car is :" + ab.getSpeed());
	    
				   	   
	
	    System.out.println(" According to Second Input Color is  "+ ab.getColor());
	 System.out.println(" According to Third Input Color is "+ac.getColor()+" and the Making is of "+ac.getMake());
	}
	

}
