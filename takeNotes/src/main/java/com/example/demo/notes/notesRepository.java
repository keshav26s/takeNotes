package com.example.demo.notes;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface notesRepository extends CrudRepository<notes, Integer>{

	public List<notes> findByUserId(int id);
	
}
