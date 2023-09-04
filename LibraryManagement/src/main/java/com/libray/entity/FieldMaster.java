package com.libray.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class FieldMaster {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int fieldId;
	String field;

	@OneToMany(mappedBy ="fieldOfStudy")
	@JsonManagedReference
	List<Journal> Journal;
	public int getFieldId() {
		return fieldId;
	}
	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public List<Journal> getJournal() {
		return Journal;
	}
	public void setJournal(List<Journal> journal) {
		Journal = journal;
	}
	
	
	
	
	
	

}
