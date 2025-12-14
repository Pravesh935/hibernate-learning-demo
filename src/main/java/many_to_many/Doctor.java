package many_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Doctor {
	@Id
	private int id;
	private String dname;
	private String prof;
	
	@ManyToMany
	List<Patient> plist;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int id, String dname, String prof, List<Patient> plist) {
		super();
		this.id = id;
		this.dname = dname;
		this.prof = prof;
		this.plist = plist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getProf() {
		return prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
	}

	public List<Patient> getPlist() {
		return plist;
	}

	public void setPlist(List<Patient> plist) {
		this.plist = plist;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", dname=" + dname + ", prof=" + prof + "]";
	}
	
	

}
