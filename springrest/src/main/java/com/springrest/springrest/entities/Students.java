package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Students {
	
	@Id
	private long id;
	private String Name;
	private String std;
	public Students(long id, String Name, String std) {
		super();
		this.id = id;
		this.Name = Name;
		this.std = std;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", Name=" + Name + ", std=" + std + "]";
	}
	
	
	
}
