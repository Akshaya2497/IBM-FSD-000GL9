package com.mycompany.spring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String fname,lname;
	@ManyToMany(mappedBy = "authors")
	private Set <Book> books = new HashSet<>();
	
	
	
	public Author() {
		super();
	}
	
	
	public Author(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}


	public Author(long id, String fname, String lname, Set<Book> books) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.books = books;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
//	@Override
//    public int hashCode() {
//        return id != null ? id.hashCode() : 0;
//    }
	@Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + fname + '\'' +
                ", lastName='" + lname + '\'' +
                ", books=" + books +
                '}';
    }



}
