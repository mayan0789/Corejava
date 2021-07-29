package collectionss;

public class Marksheet2 implements Comparable<Marksheet2> {
	private String rollNo;
	private String fname;
	private String lname;
	private int physics;
	private int chemistry;
	private int maths;

	public Marksheet2() {

	}

	public Marksheet2(String q, String r, String z, int m, int n, int b) {
		this.rollNo = q;
		this.fname = r;
		this.lname = z;
		this.physics = m;
		this.chemistry = n;
		this.maths = b;

	}

	public String getFname() {
		return fname;
	}

	public void setFname(String name) {
		this.fname = name;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public boolean equals(Object o) {
		//if (o == null)
			//return false;
		//if (!(o instanceof Marksheet))
			//return false;
		Marksheet2 other = (Marksheet2) o;
		return this.getRollNo().equals(other.getRollNo());
	}

	public int hashCode() {
		return rollNo.hashCode();
	}

	
	@Override
	public String toString() {
		return "Marksheet2 [rollNo=" + rollNo + ", fname=" + fname + ", lname=" + lname + ", physics=" + physics
				+ ", chemistry=" + chemistry + ", maths=" + maths + "]";
	}

	@Override
	public int compareTo(Marksheet2 ti) {

		return this.getRollNo().compareTo(ti.getRollNo());
	}

}
