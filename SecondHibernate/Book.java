package com.venki.SecondHIbernate;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Bookid")
	int id;
	@Column(name="BookName")
	String name;
	@Column(name="BookPrice")
	int price;
	@Column(name="BookAuthor")
	String author;
	@Column(name="BookPublisher")
	String publisher;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, int price, String author, String publisher) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
	}
	public Book( String name, int price, String author, String publisher) {
		super();
//		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, id, name, price, publisher);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && id == other.id && Objects.equals(name, other.name)
				&& price == other.price && Objects.equals(publisher, other.publisher);
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + ", publisher="
				+ publisher + "]";
	}
	

}
