package one_to_many;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Worker {
	@Id
 private int id;
 private String name;
 private int sal;
 public Worker() {
	super();
	// TODO Auto-generated constructor stub
 }
 public Worker(int id, String name, int sal) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
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
 public int getSal() {
	return sal;
 }
 public void setSal(int sal) {
	this.sal = sal;
 }
 
}
