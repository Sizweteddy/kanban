package com.kanbanboard.KanbanBoard.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table
public class WorkItem {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String username;
	
	private String workstatus;
	
	private String title;
	
	private String description;
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="work_item_user_fk")
	private User user;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="work_item_status_fk")
	private Status status;
	
	public WorkItem(){
		
		
	}
	
	public WorkItem( String username, String workstatus, String title, String description) {
		this.username = username;
		this.workstatus = workstatus;
		this.title = title;
		this.description = description;	
	}
       

	public WorkItem(User user) {
		this.user = user;
	}
	
	
	public WorkItem(Status status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getWorkstatus() {
		return workstatus;
	}

	public void setWorkstatus(String workstatus) {
		this.workstatus = workstatus;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "WorkItem [id=" + id + ", username=" + username + ", workstatus=" + workstatus + ", title=" + title
				+ ", description=" + description + ", user=" + user + ", status=" + status + "]";
	}

	
	
	
	
	
	
	

}
