package one_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	@Id
private int id;
private String name;

@OneToMany
private List<Worker> elist;

public Company() {
	super();
	// TODO Auto-generated constructor stub
}

public Company(int id, String name, List<Worker> elist) {
	super();
	this.id = id;
	this.name = name;
	this.elist = elist;
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

public List<Worker> getElist() {
	return elist;
}

public void setElist(List<Worker> elist) {
	this.elist = elist;
}

}
