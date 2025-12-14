package Task2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Actor {
	@Id
	private int id;
	private String aname;
	private int age;
	@ManyToMany
	List<Movies> mlist;

	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actor(int id, String aname, int age, List<Movies> mlist) {
		super();
		this.id = id;
		this.aname = aname;
		this.age = age;
		this.mlist = mlist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Movies> getMlist() {
		return mlist;
	}

	public void setMlist(List<Movies> mlist) {
		this.mlist = mlist;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", aname=" + aname + ", age=" + age + ", mlist=" + mlist + "]";
	}
	
	

}
