package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name= "name", nullable= false, length=20)
	private String name;
	@Column(name = "LastName", nullable= false, length=30)
	private String LastName;
	@Column(name="documentId", nullable = false, length=30)
	private String documentId;
	@Column(name="birthDate", nullable = false)
	private String birthDate;
	@Column(name="joiningDateCompany", nullable = false)
	private String joiningDateCompany;
	@Column(name="position", nullable = false)
	private String position;
	
	private double wage;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getJoiningDateCompany() {
		return joiningDateCompany;
	}
	public void setJoiningDateCompany(String joiningDateCompany) {
		this.joiningDateCompany = joiningDateCompany;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	
	
}
