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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class Journal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="journal_id")
	int journalId;
	String title;
	String author;
	Integer publicationYear;
	@JsonBackReference
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="f_id")
	FieldMaster fieldOfStudy;
	

	@OneToOne(mappedBy="journal",fetch=FetchType.LAZY)
	//@JsonManagedReference
	BorrowedItem borrowedItem;

	public int getJournalId() {
		return journalId;
	}

	public void setJournalId(int journalId) {
		this.journalId = journalId;
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

	public FieldMaster getFieldOfStudy() {
		return fieldOfStudy;
	}

	public void setFieldOfStudy(FieldMaster fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	public BorrowedItem getBorrowedItem() {
		return borrowedItem;
	}

	public void setBorrowedItem(BorrowedItem borrowedItem) {
		this.borrowedItem = borrowedItem;
	}
	
	

}
