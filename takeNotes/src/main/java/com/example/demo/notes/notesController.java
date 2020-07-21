package com.example.demo.notes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.user.user;

@RestController
public class notesController {

	@Autowired
	private notesServices notesServices;
	
	
	@RequestMapping(method=RequestMethod.GET, value="/app/sites/list/")
	public List<notes> getAllNotes(@RequestParam(name="user") int user)
	{
		return notesServices.findAllNotes(user);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/app/sites")
	public void postNotes(@RequestBody notes notes,@RequestParam(name="user") int user)
	{
		notes.setUser(new user(user,"",""));
		
		notesServices.insertNotesIntoDb(notes);
	}
	
	
}
