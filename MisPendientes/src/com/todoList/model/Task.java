package com.todoList.model;

import java.util.Date;

public class Task {
	//Task properties
	private String text;
	private Date dueDate;
	private String title;
	private Boolean completed;
	
	
	//Constructor
	public Task(String text, String title) {
		this.text = text;
		this.title = title;
		this.dueDate = new Date();
		this.completed = false;
	}
	
	
	// Methods
	public String getText(){
		return text.length() == 0 ? text : "No existe texto";
	}
	public Boolean setText(String newText){
		if(newText.length() != 0) {			
			this.text = newText;
			return true;
		} else {
			return false;
		}
	}
	
	public String getTitle(){
		return title.length() == 0 ? title : "No existe texto";
	}
	public Boolean setTitle(String newTitle){
		if(newTitle.length() != 0) {			
			this.title = newTitle;
			return true;
		} else {
			return false;
		}
	}

	public Date getDate() {
		return dueDate;
	}
	
	public void setCompleted() {
		this.completed = !completed;
	}
}
