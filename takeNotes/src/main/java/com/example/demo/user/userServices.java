package com.example.demo.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServices {
	
	@Autowired
	private userRepository uRepo;
	
	
	public void insertUserIntoDb(user user)
	{
		uRepo.save(user);
		
	}
	
	public boolean checkCredentials(user u)
	{
		String uName= u.getUsername();
		Optional<user> optUser=uRepo.findByUsername(uName);
		if(optUser.isPresent())
		{
			if(u.getPassword().equals(optUser.get().getPassword()) )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

}
