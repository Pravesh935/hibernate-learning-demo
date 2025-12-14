package ont_to_one_bidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class License {
	@Id
 private int id;
 private int licno;
 private String type;
 @OneToOne
 private Driver driver;

 public License(int id, int licno, String type, Driver driver) {
	super();
	this.id = id;
	this.licno = licno;
	this.type = type;
	this.driver = driver;
 }

 public License() {
	super();
	// TODO Auto-generated constructor stub
 }

 public int getId() {
	return id;
 }

 public void setId(int id) {
	this.id = id;
 }

 public int getLicno() {
	return licno;
 }

 public void setLicno(int licno) {
	this.licno = licno;
 }

 public String getType() {
	return type;
 }

 public void setType(String type) {
	this.type = type;
 }

 public Driver getDriver() {
	return driver;
 }

 public void setDriver(Driver driver) {
	this.driver = driver;
 }

 @Override
 public String toString() {
	return "License [id=" + id + ", licno=" + licno + ", type=" + type + ", driver=" + driver + "]";
 }
 
 
}
