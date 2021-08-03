package inputoutput;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Scaannerr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String op= "+";
		String ip = "-";
		String up = "*";
		String yp = "/";
		
		
		String ui = sc.next();
		
		
		while (ui.equals(op) ) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c= a+b;
			System.out.println("Sum is  :  "+ c);
			break;
			
		}
		
		
		while (ui.equals(ip) ) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c= a-b;
			System.out.println("Substraction is  :  "+ c);
			break;
			
		}
		while (ui.equals(up) ) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c= a*b;
			System.out.println("Multiplicaion is  :  "+ c);
			break;
			
		}
		while (ui.equals(yp) ) {
			System.out.println("Number to be divided... ");
			int a = sc.nextInt();
			
			System.out.println("Number to be divided by... ");
			int b = sc.nextInt();
			int c= a/b;
			System.out.println("Division is  :  "+ c);
			break;
			
		}
		
		sc.close();
				
		
		
	}

}
