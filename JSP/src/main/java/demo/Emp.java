package demo;
import java.io.Serializable;

public class Emp implements Serializable
{
int emp;
String name;
public Emp() {}

public  Emp(int emp,String name) {
	super();
	this.emp=emp;
	this.name=name;
}
public int getEmp() {
	return emp;
}
public void setEmp(int emp) {
	this.emp = emp;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

	
	
}
