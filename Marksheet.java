package collectionss;

import java.util.Comparator;

public class Marksheet implements Comparable<Marksheet>{

private String rollNo ;
private String name ;

private int physics ;
private int chemistry;
private int maths ;

public Marksheet() {
	
}
public Marksheet(String q,String r,String z, int m,int n, int b) {
	this.rollNo =q ;
	this.name = r;
	this.physics=m;
	this.chemistry=n;
	this.maths=b;
	
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
	if(o==null) return false;
	if(!(o instanceof Marksheet)) return false;
	Marksheet other =(Marksheet)o;
	return this.getRollNo().equals(other.getRollNo());
	}
	
public int hashCode() {
		return rollNo.hashCode();
	}
	


@Override
public String toString() {
	return "Marksheet [rollNo=" + rollNo + ", name=" + name + ", physics=" + physics + ", chemistry=" + chemistry
			+ ", maths=" + maths + "]";
}
@Override
public int compareTo(Marksheet y) {

	return this.getRollNo().compareTo(y.getRollNo()) ;
}
}
 


