package lec3.pratic;

public class pacnac {
	
	String name;
	int id;

	public pacnac() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public pacnac(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public void name() {
		System.out.println("new amount");
		System.out.println("old amount");
	}
	public void printThrowException() {
		System.out.println("Exception riaised");
		throw new IllegalArgumentException();
	}
	public String hello (String name) {
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Hallo"+ name;
	}

	
}
