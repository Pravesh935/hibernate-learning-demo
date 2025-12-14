package demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String name;
   private int mark;
   public int getId() {
	return id;
   }
  
   public Student() {
	super();
}
 

   public Student(int id, String name, int mark) {
	super();
	this.id = id;
	this.name = name;
	this.mark = mark;
}

   public Student(String name, int mark) {
	super();
	this.name = name;
	this.mark = mark;
}
 
   
    
   public String getName() {
	return name;
}

   public void setName(String name) {
	this.name = name;
   }

   public int getMark() {
	return mark;
   }

   public void setMark(int mark) {
	this.mark = mark;
   }

   @Override
   public String toString() {
   	return "Student [id=" + id + ", name=" + name + ", mark=" + mark + "]";
   }
   
   
}
