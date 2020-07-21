package com.example.demo.notes;

import com.example.demo.user.user;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class notes {
	
	@Id
	@GeneratedValue
	private int noteId;
	private String note;
	
	@ManyToOne()
	private user user;
	
	public int getNoteId() {
		return noteId;
	}

	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public user getUser() {
		return user;
	}

	public void setUser(user user) {
		this.user = user;
	}

	public notes(int noteId, String note, int userId) {
		super();
		this.noteId = noteId;
		this.note = note;
		this.user= new user(userId, "","");
	}

	public notes() {
		super();
	}

	
	
	

}
