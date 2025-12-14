package Task;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Simcard {
	@Id
	private int id;
	private String provider;
	private long number;
	
	@OneToOne
	private Mobile mob;

	public Simcard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Simcard(int id, String provider, long number, Mobile mob) {
		super();
		this.id = id;
		this.provider = provider;
		this.number = number;
		this.mob = mob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public Mobile getMob() {
		return mob;
	}

	public void setMob(Mobile mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Simcard [id=" + id + ", provider=" + provider + ", number=" + number + "]";
	}
	
	
	

}
