package construv;

public class Account1 {

		private String number = null;
		private String accountType = null;
		private double balance = 1000;
		
		public Account1() {
			
		}
		
		public double deposit(int a) {
			 balance = a + balance;
			return this.balance;
		}
		public double withdrawal(int c) {
			balance = balance - c;
			return this.balance;
		}
		public double fundTransfer(int c) {
			balance = balance + c;
			return this.balance;
		}
		public double payBill(int d) {
			balance = balance - d;
			return this.balance;
		}
		public String getNumber() {
			return number;
		}
		
		public String getAccountType() {
			return accountType;
		}
		
		public double getBalance() {
			return balance;
		}
	
		public Account1(String a) {
			number = a;
		}
		public Account1(String c, String b) {
			accountType = b;
		   number = c;
		}



	}
