package ont_to_one_bidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Driver {
	@Id
 private int id;
 private String name;
 private int age;
 @OneToOne
 private License license;

 public Driver() {
	super();
	// TODO Auto-generated constructor stub
 }

 public Driver(int id, String name, int age, License license) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.license = license;
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

 public int getAge() {
	return age;
 }

 public void setAge(int age) {
	this.age = age;
 }

 public License getLicense() {
	return license;
 }

 public void setLicense(License license) {
	this.license = license;
 }

 @Override
 public String toString() {
	return "Driver [id=" + id + ", name=" + name + ", age=" + age + ", license=" + license + "]";
 }
 
 
}
