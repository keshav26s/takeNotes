package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class userController {

	@Autowired
	private userServices userServices;
	
	@RequestMapping(method=RequestMethod.POST, value="/app/user")
	public void postUser(@RequestBody user user)
	{
		userServices.insertUserIntoDb(user);		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/app/user/auth")
	public String checkCred(@RequestBody user user)
	{
		if(userServices.checkCredentials(user))
		{
			return "Logged in";
		}
		else
		{
			return "Either username or password is incorrect";
		}
	}
}
