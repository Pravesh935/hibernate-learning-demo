package Task2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Movies {
	@Id
	private int id;
	private String mname;
	private Double budget;
	@ManyToMany
	List<Actor> alist;

	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movies(int id, String mname, Double budget, List<Actor> alist) {
		super();
		this.id = id;
		this.mname = mname;
		this.budget = budget;
		this.alist = alist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public List<Actor> getAlist() {
		return alist;
	}

	public void setAlist(List<Actor> alist) {
		this.alist = alist;
	}

	@Override
	public String toString() {
		return "Movies [id=" + id + ", mname=" + mname + ", budget=" + budget + "]";
	}
	
	
	

}
