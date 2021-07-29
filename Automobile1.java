package construv;

public class Automobile1 {

	private String color =null;
    private int speed = 0;
    private String make =null;
    public static final int NO_OF_GEARS = 6;
   
    public Automobile1() {
    	
    }
	public String getColor() {
		return color;
	}
	
	public String getMake() {
		return make;
	}
	
	public int getSpeed() {
		return speed;
	}
    
	public int brake(int j) {
		if(j==1) {
		speed = speed-10;
		}
		else if(j==2) { 
		speed = speed-20;
		} else if(j==3) { 
			speed = speed-30;
			} else if(j==4) { 
				speed = speed-40;
			} else if(j==5) { 
				speed = speed-50;
			} else if(j==6) { 
				speed = speed-60;
			} else if(j==7) { 
				speed = speed-70;
			} 
		return speed;
	}
	public int accelerator (int r) {
	if(r==0) {
		return speed;
	}
		    else if(r==1) {
			speed = speed+10;
			}
			else if(r==2) { 
			speed = speed+20;
			} else if(r==3) { 
				speed = speed+30;
				} else if(r==4) { 
					speed = speed+40;
				} else if(r==5) { 
					speed = speed+50;
				} else if(r==6) { 
					speed = speed+60;
				} else if(r<=7) { 
					speed = speed+70;
				}
		return speed;
	} 
	public int changeGear (int a) {
		if (a==1) {
			speed=15;
		} else if (a==2) {
			speed = 30 ;
		} else if (a==3) {
			speed = 45 ;
		}else if (a==4) {
			speed = 60 ;
		}else if (a==5) {
			speed = 75 ;
		} else if (a==6)
		{
			speed = 90; System.err.println( " Last Gear for 90 and above");
		}else if (a>=7){
		 	System.out.println("Not a correct input");
		}
				return speed;}
	
	public Automobile1(String y) {
	         color =y ;
	}
 public Automobile1(String r,String u) {
	 color = r;
	 make = u;
 }
	}

