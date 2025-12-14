package Task;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mobile {
	@Id
 private int id;
 private String model;
 
 @OneToOne
 private Simcard sim;

 public Mobile() {
	super();
	// TODO Auto-generated constructor stub
 }

 public Mobile(int id, String model, Simcard sim) {
	super();
	this.id = id;
	this.model = model;
	this.sim = sim;
 }

 public int getId() {
	return id;
 }

 public void setId(int id) {
	this.id = id;
 }

 public String getModel() {
	return model;
 }

 public void setModel(String model) {
	this.model = model;
 }

 public Simcard getSim() {
	return sim;
 }

 public void setSim(Simcard sim) {
	this.sim = sim;
 }

 @Override
 public String toString() {
	return "Mobile [id=" + id + ", model=" + model + ", sim=" + sim + "]";
 }
 
 
 
}
