package com.libray.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class GenreMaster {
	@Id
	@GeneratedValue
	@Column(name="genre_id")
	private int genreId;
	private String genreName;
	
	@OneToMany(mappedBy="genreMaster",fetch=FetchType.LAZY)
	@JsonManagedReference
	private List<Book> book;
	
	public int getGenreId() {
		return genreId;
	}
	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}
	public String getGenreName() {
		return genreName;
	}
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	
	
	
	
	

}
