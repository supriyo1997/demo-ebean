package models;

import java.util.*;

import io.ebean.Finder;
//import org.apache.maven.model.Model;
//import com.avaje.ebean.Model;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book extends Model {
	
	@Id
	public Integer id;
	public String title;
	public Integer price;
	public String author;
	
	public static Finder<Integer,Book> find = new Finder<>(Book.class);
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer id, String title, Integer price, String author) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	private static Set<Book> books;
	
	static {
		books=new HashSet<>();
		books.add(new Book(1,"c++",45,"asc"));
		books.add(new Book(2,"java",90,"xyz"));
		
	}
	
	public static Set<Book> allBooks()
	{
		return books;
	}
	
	public static Book findById(Integer id)
	{
		for(Book book:books)
		{
			if(id.equals(book.id))
			{
				return book;
			}
		}
		return null;
	}
	
	public static void add(Book book)
	{
		books.add(book);
	}
	
	public static boolean remove(Book book)
	{
		return books.remove(book);
	}

}
