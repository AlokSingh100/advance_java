package sunita.neha;

public class Student {

	int id;
	String sname;
	Faculty faculty;
	public Student(int id, String sname, Faculty faculty) {
		super();
		this.id = id;
		this.sname = sname;
		this.faculty = faculty;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", faculty=" + faculty + "]";
	}
	
	
}
