package com.libray.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ColumnDefault;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_id")
	int bookId;
	String title;
	String author;
	Integer publicationYear;
	@ColumnDefault("'Pending'")
	String status="Pending";// available/pending
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="genre_id")
	GenreMaster genreMaster;

	@OneToOne(mappedBy="book",fetch=FetchType.LAZY)
	@JsonManagedReference
	BorrowedItem borrowedItem;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(Integer publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public GenreMaster getGenreMaster() {
		return genreMaster;
	}

	public void setGenreMaster(GenreMaster genreMaster) {
		this.genreMaster = genreMaster;
	}

	public BorrowedItem getBorrowedItem() {
		return borrowedItem;
	}

	public void setBorrowedItem(BorrowedItem borrowedItem) {
		this.borrowedItem = borrowedItem;
	}
	
	
	
	
	
	
	
	
}
