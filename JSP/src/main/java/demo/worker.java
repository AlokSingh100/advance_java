package demo;

import java.io.Serializable;

public class worker implements Serializable
{

	
	int sal;
	String name;
	
	
	public worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
