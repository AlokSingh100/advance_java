package main.imp;

public class Passport {

	int num;
	String valid_year;
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passport(int num, String valid_year) {
		super();
		this.num = num;
		this.valid_year = valid_year;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getValid_year() {
		return valid_year;
	}
	public void setValid_year(String valid_year) {
		this.valid_year = valid_year;
	}
	
}
