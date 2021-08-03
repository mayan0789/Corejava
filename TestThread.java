package inputoutput;

public class TestThread  {


	public static void main(String[] args)  {
	
DemoThread k1 = new DemoThread("Chalo");

Thread d1 = new Thread(k1);
d1.start();

	}

}
