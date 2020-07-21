package com.example.demo.user;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.demo.notes.notes;



@Entity
public class user {

	@Id
	@GeneratedValue
	private int id;
	
	private String username;
	private String password;
//	
//	@OneToMany
//	private ArrayList<notes> notes;

	public user() {
		super();
	} 
	
	public user(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public ArrayList<notes> getNotes() {
//		return notes;
//	}
//
//	public void setNotes(ArrayList<notes> notes) {
//		this.notes = notes;
//	}
	
}
