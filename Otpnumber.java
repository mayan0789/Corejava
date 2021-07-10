package in.co.rays;

public class Otpnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=   test();
        System.out.print(j);
//        
       }
public static int test() {
      int k = (int) (Math.random()*100000);
  	return k;

	}

}
