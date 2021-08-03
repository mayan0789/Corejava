package inputoutput;

public class DemoThread implements Runnable{

	private String nam;
	
	
	public DemoThread(String na) {
		this.nam = na;
	}
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println(i+" "+nam);
		}
	}
}
