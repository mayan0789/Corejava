package construv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person1 {

	private String firstname = null; String lastname = null; 
	private String address = null;
	private Date dob = null;
	private String DOB = null;
	public static final int AVG_AGE = 25;
	
	public Person1() {}
	
	public Person1(String j) {
		firstname = j;
	}
	public Person1(String o, String p) {
		firstname = o;
		lastname = p;
	}
	public Person1(String k, String l, String j, String b) throws ParseException {
		firstname = k;
		lastname = l;
		address = j;
		SimpleDateFormat sdk = new SimpleDateFormat( "dd/MM/yyyy");
				dob = sdk.parse(b);
				DOB = sdk.format(dob);
				
	}
 
	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getAddress() {
		return address;
	}

	public Date getDob() {
		return dob;
	}
	public String getDOB() {
		return DOB;
	}
	
}
