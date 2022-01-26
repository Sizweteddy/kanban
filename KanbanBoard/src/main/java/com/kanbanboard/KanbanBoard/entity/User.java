package com.kanbanboard.KanbanBoard.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class User {

	@Id
	@GeneratedValue 
	private int id;
	
	private String name;
	
	private String email;
	
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
	private WorkItem workItem;
	
	
	public User() {
			
	}
	
	


	public User(String name, String email) {
		this.name = name;
		this.email = email;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", workItem=" + workItem + "]";
	}
	
	
}
