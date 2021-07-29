package construv;

public class TestAccount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Account1 a = new Account1();
		Account1 dc = new Account1("ABC23315");
	         Account1 ro = new Account1("CBA8999"," Single User Account");
		
		int rev = 35;
		int qwe = -50;
		int asd = 75;
		int zxc = 20;
		
		double op = a.deposit(rev);
		double lk = a.fundTransfer(qwe);
		double mn = a.payBill(asd);
		double as = a.withdrawal(zxc);
		
		
		System.out.println("The Number of this Bank Account is -- "+a.getNumber());
		System.out.println("The type of this Bank Account is -- "+a.getAccountType());
		System.out.println();
		System.out.println("After Depositing Rs."+rev+" your available balance is " +""+op);
		System.out.println("After making the FundTranfer of Rs."+ qwe+" your available balance is "+lk);
		System.out.println("After the Bill payment of Rs. "+ asd +" your available balance is  "+mn);
		System.out.println("After the Withdrawal of Rs. "+ zxc+" your available balance is "+as);
		System.out.println();
		System.out.println("The current available Balance is "+" ||| "+a.getBalance()+" ||| ");

		System.out.println("  The number and type of Account for Second Input is --- "+ro.getNumber()+"    " +ro.getAccountType());
       System.out.println("The Account number for first input is  ----- "+dc.getNumber());
	}

}
