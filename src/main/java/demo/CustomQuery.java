package demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomQuery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int mark;
	private long mobno;
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
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public CustomQuery(String name, int mark, long mobno) {
		super();
		this.name = name;
		this.mark = mark;
		this.mobno = mobno;
	}
	public CustomQuery() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomQuery [id=" + id + ", name=" + name + ", mark=" + mark + ", mobno=" + mobno + "]";
	}
	
	
	
}
