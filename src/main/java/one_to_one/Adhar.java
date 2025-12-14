package one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adhar {
  @Id
  private int id;
  private long adharno ;
  private String address;
  
  public Adhar() {
	  
  }
  
  public Adhar(int id, long adharno, String address) {
	super();
	this.id = id;
	this.adharno = adharno;
	this.address = address;
  }

  public int getId() {
	return id;
  }

  public void setId(int id) {
	this.id = id;
  }

  public long getAdharno() {
	return adharno;
  }

  public void setAdharno(long adharno) {
	this.adharno = adharno;
  }

  public String getAddress() {
	return address;
  }

  public void setAddress(String address) {
	this.address = address;
  }

  @Override
  public String toString() {
	return "Adhar [id=" + id + ", adharno=" + adharno + ", address=" + address + "]";
  }
  
  
}
