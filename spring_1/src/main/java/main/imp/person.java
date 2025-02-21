package main.imp;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class person {

	int id;
	String name;
	int age;
	List<String> phno;
	Set<String> hobbies;
	Map<String, String>card;
	
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public person(int id, String name, int age, List<String> phno, Set<String> hobbies, Map<String, String> card,
			Passport pass) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phno = phno;
		this.hobbies = hobbies;
		this.card = card;
		this.pass = pass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getPhno() {
		return phno;
	}
	public void setPhno(List<String> phno) {
		this.phno = phno;
	}
	public Set<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}
	public Map<String, String> getCard() {
		return card;
	}
	public void setCard(Map<String, String> card) {
		this.card = card;
	}
	public Passport getPass() {
		return pass;
	}
	public void setPass(Passport pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", age=" + age + ", phno=" + phno + ", hobbies=" + hobbies
				+ ", card=" + card + ", pass=" + pass + "]";
	}
	
	
}
