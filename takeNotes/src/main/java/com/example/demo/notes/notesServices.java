package com.example.demo.notes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class notesServices {

	@Autowired
	private notesRepository nRepo;
	
	public List<notes> findAllNotes(int userId)
	{
		List<notes> notes= new ArrayList<>();
		nRepo.findByUserId(userId).forEach(notes::add);
		return notes;
	}

	public void insertNotesIntoDb(notes notes) {
		nRepo.save(notes);
		
		
		
	}
}
