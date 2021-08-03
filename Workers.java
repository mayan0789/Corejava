package inputoutput;

import java.io.Serializable;

public class Workers implements Serializable{
	
	private int id;
	private String name;
	private String surname;
	private transient String Code;
	
	
	public Workers(int j, String k, String l,String m) {
		this.id=j;
		this.name=k;
		this.surname=l;
		this.Code=m;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getCode() {
		return Code;
	}
}
