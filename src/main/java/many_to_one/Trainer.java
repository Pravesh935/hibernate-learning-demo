package many_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Trainer {
	@Id
	private int id;
	private String tname;
	private String subject;
	
	@ManyToOne
	private College college;

	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainer(int id, String tname, String subject, College college) {
		super();
		this.id = id;
		this.tname = tname;
		this.subject = subject;
		this.college = college;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", tname=" + tname + ", subject=" + subject + ", college=" + college + "]";
	}
	
	

}
