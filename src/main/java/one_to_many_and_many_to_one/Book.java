package one_to_many_and_many_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	private int id;
	private String name;
	private int price;
	 
	@ManyToOne
	private Library lib;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String name, int price, Library lib) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.lib = lib;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Library getLib() {
		return lib;
	}

	public void setLib(Library lib) {
		this.lib = lib;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
