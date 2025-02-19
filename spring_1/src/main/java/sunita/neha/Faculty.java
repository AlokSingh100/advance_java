package sunita.neha;

public class Faculty {
	
	int fild;
	String fname;
	String course;
	public Faculty(int fild, String fname, String course) {
		super();
		this.fild = fild;
		this.fname = fname;
		this.course = course;
	}
	public int getFild() {
		return fild;
	}
	public void setFild(int fild) {
		this.fild = fild;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Faculty [fild=" + fild + ", fname=" + fname + ", course=" + course + "]";
	}
	
	

}
