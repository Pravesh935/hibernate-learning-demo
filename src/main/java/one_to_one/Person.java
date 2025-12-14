package one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
 @Id
 private int id;
 private String name;
 private int age;
 
 @OneToOne
 private Adhar adhar;
 
 public Person() {
	 
 }

 public Person(int id, String name, int age, Adhar adhar) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.adhar = adhar;
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

 public Adhar getAdhar() {
	return adhar;
 }

 public void setAdhar(Adhar adhar) {
	this.adhar = adhar;
 }

 @Override
 public String toString() {
	return "Person [id=" + id + ", name=" + name + ", age=" + age + ", adhar=" + adhar + "]";
 }
}
