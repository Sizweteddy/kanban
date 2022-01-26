package com.kanbanboard.KanbanBoard.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table
public class Status {

	
	@Id
	@GeneratedValue
	private int id;
	
	private String todo;
	
	private boolean in_progress;
	
	private boolean done;
	
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "status")
	private WorkItem workItem;
	
	
	public Status() {
		
	}


	public Status( String todo, boolean in_progress, boolean done) {
		this.todo = todo;
		this.in_progress = in_progress;
		this.done = done;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTodo() {
		return todo;
	}


	public void setTodo(String todo) {
		this.todo = todo;
	}


	public boolean isIn_progress() {
		return in_progress;
	}


	public void setIn_progress(boolean in_progress) {
		this.in_progress = in_progress;
	}


	public boolean isDone() {
		return done;
	}


	public void setDone(boolean done) {
		this.done = done;
	}


	@Override
	public String toString() {
		return "Status [id=" + id + ", todo=" + todo + ", in_progress=" + in_progress + ", done=" + done + ", workItem="
				+ workItem + "]";
	}
	
	
	
	

}
