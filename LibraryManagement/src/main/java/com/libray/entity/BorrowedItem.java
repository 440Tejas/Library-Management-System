package com.libray.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="borrowed_items")
public class BorrowedItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int itemId;
	float charges;//default 0
	int assignTo;
	
	@OneToOne
	@JoinColumn(name="journal_id")
	Journal journal;
	
	
	@OneToOne
	@JsonBackReference
	@JoinColumn(name = "book_id")
	Book book;
	
	
	
	//List<User> user;
	
	String chargesApplicable;// default no
	@Column(columnDefinition = "varchar(255) default 'Pending'")
	//@JsonBackReference
	String status;//submitted,not submitted,late submitted
	String description;
	@Column(columnDefinition = "TIMESTAMP")//current date)
	LocalDateTime borrowedDate; 
	LocalDate dueDate;// will be available
	
	LocalDate sumbittedDate;
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public int getAssignTo() {
		return assignTo;
	}
	public void setAssignTo(int assignTo) {
		this.assignTo = assignTo;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Journal getJournal() {
		return journal;
	}
	public void setJournal(Journal journal) {
		this.journal = journal;
	}
	public String getChargesApplicable() {
		return chargesApplicable;
	}
	public void setChargesApplicable(String chargesApplicable) {
		this.chargesApplicable = chargesApplicable;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getBorrowedDate() {
		return borrowedDate;
	}
	public void setBorrowedDate(LocalDateTime borrowedDate) {
		this.borrowedDate = borrowedDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public LocalDate getSumbittedDate() {
		return sumbittedDate;
	}
	public void setSumbittedDate(LocalDate sumbittedDate) {
		this.sumbittedDate = sumbittedDate;
	}
	
	
	
}
