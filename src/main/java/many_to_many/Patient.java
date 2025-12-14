package many_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Patient {
	@Id
	private int id;
	private String pname;
	private String deciese;
	
	@ManyToMany
	List<Doctor> dlist;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int id, String pname, String deciese, List<Doctor> dlist) {
		super();
		this.id = id;
		this.pname = pname;
		this.deciese = deciese;
		this.dlist = dlist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDeciese() {
		return deciese;
	}

	public void setDeciese(String deciese) {
		this.deciese = deciese;
	}

	public List<Doctor> getDlist() {
		return dlist;
	}

	public void setDlist(List<Doctor> dlist) {
		this.dlist = dlist;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", pname=" + pname + ", deciese=" + deciese + ", dlist=" + dlist + "]";
	}
	
	

}
